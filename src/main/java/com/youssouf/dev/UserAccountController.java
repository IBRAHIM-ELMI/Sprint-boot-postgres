package com.youssouf.dev;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youssouf.dev.entity.UserAccount;
import com.youssouf.dev.repository.UserAccountRepository;

@Controller
//@RequestMapping(path = "/userAccount")
public class UserAccountController {
	@Autowired
	UserAccountRepository userAccountRepository;

	@GetMapping("/add")
	@ResponseBody
	public String addUser() {

		UserAccount user = new UserAccount("youssouf", "123", "yous@hotmail.com");
		UserAccount user2 = new UserAccount("ahmed", "258", "ahmed@hotmail.com");
		UserAccount user3 = new UserAccount("loula", "8972", "lula@hotmail.com");
		UserAccount user4 = new UserAccount("said", "2588963", "said@hotmail.com");

		userAccountRepository.save(user);
		userAccountRepository.save(user2);
		userAccountRepository.save(user3);
		userAccountRepository.save(user4);

		return "fait";

	}

	/*
	 * Mapping url exmaple:
	 * http://localhost:8080/userAccount/updateUser?userName=Jerry&password=hello&
	 * email=hello_jerry@gmail.com
	 */
//    @GetMapping(path = "/updateUser")
//    @ResponseBody
//    public String updateUser(@RequestParam String userName, @RequestParam String password, @RequestParam String email) {
//
//        StringBuffer retBuf = new StringBuffer();
//
//        List<UserAccount> userAccountList = userAccountRepository.findByUsername(userName);
//
//        if (userAccountList != null) {
//            for (UserAccount user : userAccountList) {
//                user.setUser_name("Mahdi");
//                user.setPasseword("0123456");
//                user.setEmail("Mahdi@hotmail.com");
//                userAccountRepository.save(user);
//            }
//        }
//
//        retBuf.append("User data update successfully.");
//
//        return retBuf.toString();
//    }

	
	

//	@Override
//	public <S extends UserAccount> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends UserAccount> Iterable<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<UserAccount> findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean existsById(Long id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<UserAccount> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Iterable<UserAccount> findAllById(Iterable<Long> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(UserAccount entity) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends UserAccount> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<UserAccount> findByName(@RequestParam String user_name) {
//
//		StringBuffer retBuf = new StringBuffer();
//		List<UserAccount> userAccountList = (List<UserAccount>) userAccountRepository.findByName(user_name);
//
//		if (userAccountList != null) {
//			for (UserAccount userAccount : userAccountList) {
//				retBuf.append("user name = ");
//				retBuf.append(userAccount.getUser_name());
//				retBuf.append(", password = ");
//				retBuf.append(userAccount.getPasseword());
//				retBuf.append(", email = ");
//				retBuf.append(userAccount.getEmail());
//				retBuf.append("\r\n");
//			}
//		}
//
//		if (retBuf.length() == 0) {
//			retBuf.append("No record find.");
//		}
//
//		return null;
//	}

//	    /*
//	     * Mapping url exmaple: http://localhost:8080/userAccount/findAll
//	     */
//	    @GetMapping(path = "/findAll")
//	    @ResponseBody
//	    public String findAllUser() {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        List<UserAccount> userAccountList = (List<UserAccount>) userAccountRepository.findAll();
//
//	        if (userAccountList != null) {
//	            for (UserAccount userAccount : userAccountList) {
//	                retBuf.append("user name = ");
//	                retBuf.append(userAccount.getUser_name());
//	                retBuf.append(", password = ");
//	                retBuf.append(userAccount.getPasseword());
//	                retBuf.append(", email = ");
//	                retBuf.append(userAccount.getEmail());
//	                retBuf.append("\r\n");
//	            }
//	        }
//
//	        if (retBuf.length() == 0) {
//	            retBuf.append("No record find.");
//	        } else {
//	            retBuf.insert(0, "<pre>");
//	            retBuf.append("</pre>");
//	        }
//
//	        return retBuf.toString();
//	    }
//
//	    /*
//	     * Mapping url exmaple:
//	     * http://localhost:8080/userAccount/findByName?userName=Jerry
//	     */
//	    @GetMapping("/findByName")
//	    @ResponseBody
//	    public String findByName(@RequestParam String userName) {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        List<UserAccount> userAccountList = userAccountRepository.findByName(userName);
//	       
//	        if (userAccountList != null) {
//	            for (UserAccount user : userAccountList) {
//	                retBuf.append("user name = ");
//	                retBuf.append(user.getUser_name());
//	                retBuf.append(", password = ");
//	                retBuf.append(user.getPasseword());
//	                retBuf.append(", email = ");
//	                retBuf.append(user.getEmail());
//	                retBuf.append("\r\n");
//	            }
//	        }
//
//	        if (retBuf.length() == 0) {
//	            retBuf.append("No record find.");
//	        }
//
//	        return retBuf.toString();
//	    }
//
//	    /*
//	     * Mapping url exmaple:
//	     * http://localhost:8080/userAccount/findByNameAndPassword?userName=Jerry&
//	     * password=888888
//	     */
//	    @GetMapping(path = "/findByNameAndPassword")
//	    @ResponseBody
//	    public String findByNameAndPassword(@RequestParam String userName, @RequestParam String password) {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        List<UserAccount> userAccountList = (List<UserAccount>) userAccountRepository
//	                .findByUsernameAndPassword(userName, password);
//
//	        if (userAccountList != null) {
//	            for (UserAccount userAccount : userAccountList) {
//	                retBuf.append("user name = ");
//	                retBuf.append(userAccount.getUsername());
//	                retBuf.append(", password = ");
//	                retBuf.append(userAccount.getPassword());
//	                retBuf.append(", email = ");
//	                retBuf.append(userAccount.getEmail());
//	                retBuf.append("<br/>");
//	            }
//	        }
//
//	        if (retBuf.length() == 0) {
//	            retBuf.append("No record find.");
//	        }
//
//	        return retBuf.toString();
//	    }
//
//	    /*
//	     * Mapping url exmaple:
//	     * http://localhost:8080/userAccount/updateUser?userName=Jerry&password=hello&
//	     * email=hello_jerry@gmail.com
//	     */
//	    @GetMapping(path = "/updateUser")
//	    @ResponseBody
//	    public String updateUser(@RequestParam String userName, @RequestParam String password, @RequestParam String email) {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        List<UserAccount> userAccountList = userAccountRepository.findByUsername(userName);
//
//	        if (userAccountList != null) {
//	            for (UserAccount userAccount : userAccountList) {
//	                userAccount.setUsername(userName);
//	                userAccount.setPassword(password);
//	                userAccount.setEmail(email);
//	                userAccountRepository.save(userAccount);
//	            }
//	        }
//
//	        retBuf.append("User data update successfully.");
//
//	        return retBuf.toString();
//	    }
//
//	    /*
//	     * Mapping url exmaple:
//	     * http://localhost:8080/userAccount/deleteByUserName?userName=Richard
//	     */
//	    @GetMapping(path = "/deleteByUserName")
//	    @ResponseBody
//	    public String deleteByUserName(@RequestParam String userName) {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        userAccountRepository.deleteByUsername(userName);
//
//	        retBuf.append("User data has been deleted successfully.");
//
//	        return retBuf.toString();
//	    }
//
//	    /*
//	     * Mapping url exmaple:
//	     * http://localhost:8080/userAccount/deleteByUserNameAndPassword?userName=
//	     * Richard&password=888888
//	     */
//	    @GetMapping(path = "/deleteByUserNameAndPassword")
//	    @ResponseBody
//	    public String deleteByUserNameAndPassword(@RequestParam String userName, @RequestParam String password) {
//
//	        StringBuffer retBuf = new StringBuffer();
//
//	        userAccountRepository.deleteByUsernameAndPassword(userName, password);
//
//	        retBuf.append("User data has been deleted successfully.");
//
//	        return retBuf.toString();
//	    }

}
