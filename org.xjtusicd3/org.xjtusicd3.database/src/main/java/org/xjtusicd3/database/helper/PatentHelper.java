package org.xjtusicd3.database.helper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.xjtusicd3.database.logic.SqlSessionManager;
import org.xjtusicd3.database.mapper.PersistencePatentMapper;
import org.xjtusicd3.database.model.PersistencePatent;



public class PatentHelper {
	public static List<PersistencePatent> getRecord(int start,int end) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		List<PersistencePatent> records =  mapper.getpatent(start, end);
		session.close();
		return records;
	}


	public int count(long time2) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		return mapper.count(time2);
	}
	

	public static List<PersistencePatent> getByname(String patentName,String patentTime){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		    String patentName1 = "%" + patentName + "%";
		    String patentTime1 = "%" + patentTime + "%";
		    session.close();
		 return mapper.getByname(patentName1, patentTime1);
	}

	public  PersistencePatent detailCheck(String IPC) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		return mapper.detailCheck(IPC);
	}

	public void delete(String iPC) {
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		mapper.deleteByIPC(iPC);
		return;
	}

	/*
	 * 专利查询
	 */
	public static List<PersistencePatent> query(String number,String name,String IPC){
		SqlSession session = SqlSessionManager.getSqlSessionFactory().openSession(true);
		PersistencePatentMapper mapper = session.getMapper(PersistencePatentMapper.class);
		String newNumber = "%" + number + "%";
		String newName = "%" + name + "%";
		String newIPC = "%" + IPC + "%";
		List<PersistencePatent> patents =  mapper.select(newNumber, newName, newIPC);
		session.close();
		return patents;
	}
	

}
