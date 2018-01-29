
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import pojos.Concepto;
import util.HibernateUtil;

/**
 *
 * @author David Claveria
 */
 @Controller

public class ConceptoController {
     
     @RequestMapping(value = "/concepto", method = RequestMethod.GET)
     
     public ModelAndView concepto (HttpServletRequest request , HttpServletResponse response) throws Exception {
     
      ModelAndView mv = new ModelAndView ("/conceptos");
      List<Concepto> c = null;
      
         try {
             
             Session session = HibernateUtil.getSessionFactory().openSession();
             Transaction tx = session.beginTransaction();
             
             String hql = "from Concepto"; //hql es un lenguakje para hacer consulrtas en hibernate. Sirve para hacer Select
             Query query = session.createQuery(hql);
             c = query.list();
             
                          
             tx.commit();
             session.close();
             
             mv.addObject ( "conceptos", c);
             mv.addObject("message" ,"hello");
                          
         } catch (Exception e) {
             
            e.printStackTrace();
         }
         
         return mv;
     }
    
    
    
}
