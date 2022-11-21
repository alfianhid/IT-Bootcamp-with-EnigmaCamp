import com.alfianhid.dao.BookDAO;
import com.alfianhid.dao.MemberDAO;
import com.alfianhid.dao.TransDAO;
import com.alfianhid.model.Book;
import com.alfianhid.model.Member;
import com.alfianhid.model.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");

/*        // Instantiate for Book
        Book book1 = context.getBean("Book1", Book.class);
        Book book2 = context.getBean("Book2", Book.class);
        BookDAO bookDAO = context.getBean("BookDAO", BookDAO.class);*/

        // Instantiate for Member
        //Member member1 = context.getBean("Member1", Member.class);
        //Member member2 = context.getBean("Member2", Member.class);
        //MemberDAO memberDAO = context.getBean("MemberDAO", MemberDAO.class);

        // Instantiate for Transaction
        Transaction trans1 = context.getBean("Trans1", Transaction.class);
        TransDAO transDAO = context.getBean("TransDAO", TransDAO.class);

/*        // CRUD for Book
        // INSERT
        bookDAO.insertBook(book1);
        bookDAO.insertBook(book2);
        // GET BY ID
        System.out.println(bookDAO.getBookByID(2));
        // UPDATE
        bookDAO.updateBook(book1, 1);
        // DELETE
        bookDAO.deleteBook(book1, 1);
        // GET BOOK LIST
        System.out.println("Your book list includes :");
        for (int i = 0; i < bookDAO.getBookList().size(); i++) {
            System.out.println(bookDAO.getBookList().get(i));
        }*/

        // CRUD for Member
        // INSERT
        //memberDAO.insertMember(member1);
        //memberDAO.insertMember(member2);
        // GET BY ID
        //System.out.println(memberDAO.getMemberByID(1));
        // UPDATE
        //memberDAO.updateMember(member1, 1);
        // DELETE
        //memberDAO.deleteMember(member1, 1);
        // GET BOOK LIST
        //System.out.println("Your book list includes :");
        //for (int i = 0; i < memberDAO.getMemberList().size(); i++) {
        //    System.out.println(memberDAO.getMemberList().get(i));
        //}

        // Purchase a book
        transDAO.purchaseBook(2,1,trans1);
    }
}
