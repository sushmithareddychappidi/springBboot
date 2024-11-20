package org.jsp.ProjectAnnotation.Dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ListIterator;

import org.jsp.ProjectAnnotation.Entity.Product;

public class ProductDaoImplementation implements ProductDao
{

	@Override
	public void addToFile(Product pro) throws Exception 
	{
		List<Product> product = null;
		product.add(pro);
		File f=new File("C:\\Users\\susmitha\\eclipse-workspace\\spring\\PersonProductProject\\product.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(pro);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("Product Added");		
	}
//	public Product fetchProduct(String id) throws Exception
//	{
//		ListIterator<Student> li=getFromFile().listIterator();
//		while(li.hasNext())
//		{
//			Student s=li.next();
//			if(s.getStd_id().equals(id))
//			{
//				return s;
//			}
//		}	
//		return null;
//	}

}
