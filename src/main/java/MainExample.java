import com.samane.dao.ContactDao;
import com.samane.dao.PhoneBookDao;
import com.samane.dao.UserDao;
import com.samane.model.Address;
import com.samane.model.Contact;
import com.samane.model.PhoneBook;
import com.samane.model.User;

public class MainExample {

	public static void main(String[] args) {
	
		ContactDao cdao=new ContactDao();
//		cdao.createUser(c);
	PhoneBookDao pDao=new PhoneBookDao();
	PhoneBook p=new PhoneBook("owner");
	Contact c=new Contact("ali",9999);
	Contact c2=new Contact("zahra",654);
//cdao.createContact(c);
//cdao.createContact(c2);

//	p.addContact(c);
//	p.addContact(c2);
//	c.setPhoneBook(p);
//	c2.setPhoneBook(p);
//	pDao.createUser(p);
//		
//	User u=new User("sahar","far");	
//	Address a=new Address("zzzz",5);
//	u.setAddress(a);
////	u.addPhoneBook(p);
////	p.addUser(u);
//	UserDao uDao=new UserDao();
//	uDao.createUser(u);
//	Contact x=cdao.getContactById(9);
//	cdao.deleteUser(x);
	cdao.deleteContactByName("ali");
//	x.setName("mahsa");
//	cdao.updateContactById(7, "ahmad");
//cdao.updateContact(x);
//	System.out.println(x.getName());
//cdao.getContactByName("ali").stream().map(m->m.getName()).forEach(System.out::println);
	
//	pDao.createUser(p);
//pDao.getPhoneBookById(1).getListContact().stream().map(m-> m.getName()).forEach(System.out::println);
	}

}
