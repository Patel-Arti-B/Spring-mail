package com.xworkz.springmail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.springmail.service.MailService;

@Controller
@RequestMapping("/")
public class MailController {
	private static final Logger logger = Logger.getLogger(MailController.class);

	@Autowired
	private MailService mailService;

	public MailController() {
		logger.info("Obj created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/sendMail.do", method = RequestMethod.POST)
	public String sendMail(@RequestParam String toMailId, @RequestParam String subject, @RequestParam String body) {
		logger.info("inside sendMail() in MailController...");

		logger.info("Mail Id:" + toMailId);
		logger.info("Subject:" + subject);
		logger.info("Body:" + body);

		mailService.sendMailByEmailId(toMailId, subject, body);

		return "Success";
	}
}
