package com.dart9.tudulists;

import com.dart9.tudulists.config.RootConfig;
import com.dart9.tudulists.demo.HarryAngel;
import com.dart9.tudulists.role.Role;
import com.dart9.tudulists.role.RoleManager;
import com.dart9.tudulists.role.RoleManagerImpl;
import com.dart9.tudulists.user.User;
import com.dart9.tudulists.user.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionExecution;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Calendar;

public class TudulistsApplication {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

		PlatformTransactionManager transactionManager = context.getBean("hibernateTransactionManager", PlatformTransactionManager.class);

        UserManager userManager = (UserManager) context.getBean(("userManager"));
        System.out.println("UserDAO = " + userManager.getUserDAO());

		User user1 = new User();
		user1.setFirstName("David");
		user1.setLastName("REGNAULT");
		user1.setEmail("david.regnault@gmail.com");
		user1.setEnabled(true);
		user1.setLogin("dart9");
		user1.setCreateDate(Calendar.getInstance().getTime());
		user1.setDateFormat("jj/mm/yyyy");

		Role adminRole = new Role();
		adminRole.setRole("admin");
		user1.setRole(adminRole);

		Role userRole = new Role();
		userRole.setRole("user");
		RoleManager roleManager = context.getBean("roleManager", RoleManager.class);
		roleManager.createRole(userRole);

		System.out.println("Utilisateur 1 : " + user1.getFirstName() + " " + user1.getLastName() + " - Date de création = " + user1.getCreateDate() + " " + user1);

		HarryAngel harryAngel = (HarryAngel) context.getBean("harryAngel");
		System.out.println("Valeur de BeanName : " + harryAngel.getBeanName());

		userManager.createUser(user1);
	}
}
