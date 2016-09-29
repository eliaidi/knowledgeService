package org.xjtusicd3.partner.service;

import java.util.ArrayList;
import java.util.List;

import org.xjtusicd3.database.helper.PatentHelper;
import org.xjtusicd3.database.model.PersistencePatent;
import org.xjtusicd3.database.model.PersistencePatentcount;
import org.xjtusicd3.partner.view.ViewPatent;
import org.xjtusicd3.partner.view.ViewPatentVisual;

public class PatentService {
	public static List<ViewPatent> select(String number,String name,String IPC){
		List<ViewPatent> listPatent = new ArrayList<ViewPatent>();
		List<PersistencePatent> persistencePatent = PatentHelper.query(number, name, IPC);
		if (persistencePatent == null) {
			return null;
		}
		for(PersistencePatent persistencePatent2:persistencePatent){
			ViewPatent viewPatent = new ViewPatent(persistencePatent2);
			listPatent.add(viewPatent);
		}
		return listPatent;
		
	} 
	/*
	 * 根据专利号查询
	 */
	public static List<ViewPatent> selectByNumber(String number){
		List<ViewPatent> listPatent = new ArrayList<ViewPatent>();
		List<PersistencePatent> persistencePatent = PatentHelper.queryByNumber(number);
		if (persistencePatent == null) {
			return null;
		}
		for(PersistencePatent persistencePatent2:persistencePatent){
			ViewPatent viewPatent = new ViewPatent(persistencePatent2);
			listPatent.add(viewPatent);
		}
		return listPatent;
	}
	/*
	 * 根据专利名称查询
	 */
	public static List<ViewPatent> selectByName(String name){
		List<ViewPatent> listPatent = new ArrayList<ViewPatent>();
		List<PersistencePatent> persistencePatent = PatentHelper.queryByName(name);
		if (persistencePatent == null) {
			return null;
		}
		for(PersistencePatent persistencePatent2:persistencePatent){
			ViewPatent viewPatent = new ViewPatent(persistencePatent2);
			listPatent.add(viewPatent);
		}
		return listPatent;
	}

	/*
	 * 根据IPC查询
	 */
	public static List<ViewPatent> selectByIPC(String IPC){
		List<ViewPatent> listPatent = new ArrayList<ViewPatent>();
		List<PersistencePatent> persistencePatent = PatentHelper.queryByIPC(IPC);
		if (persistencePatent == null) {
			return null;
		}
		for(PersistencePatent persistencePatent2:persistencePatent){
			ViewPatent viewPatent = new ViewPatent(persistencePatent2);
			listPatent.add(viewPatent);
		}
		return listPatent;
	}
	/*
	 * IPC形成发明人图
	 */
	public static List<ViewPatentVisual> InventorVisual(String IPC){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.rank_Inventor(IPC);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
	/*
	 * IPC形成专利权人图
	 */
	public static List<ViewPatentVisual> HolderVisual(String IPC){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.rank_Holder(IPC);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
	/*
	 * IPC形成申请时间图
	 */
	public static List<ViewPatentVisual> ApplicationVisual(String IPC){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.rank_Application(IPC);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
	/*
	 * IPC形成宣布时间图
	 */
	public static List<ViewPatentVisual> AnnouncementVisual(String IPC){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.rank_Announcement(IPC);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
	/*
	 * IPC形成省市、专权人气泡图
	 */
	public static List<ViewPatentVisual> PopoVisual(String IPC){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.popo_ProvinceHolder(IPC);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
	/*
	 * IPC形成企业专利数量图
	 */
	public static List<ViewPatentVisual> Number_holderpatent(String holder){
		List<ViewPatentVisual> listPatentVisual = new ArrayList<ViewPatentVisual>();
		List<PersistencePatentcount> persistencePatentcount = PatentHelper.rank_HolderPatentNumber(holder);
		if (persistencePatentcount == null) {
			return null;
		}
		for(PersistencePatentcount persistencePatentcounts2:persistencePatentcount){
			ViewPatentVisual viewPatentVisual = new ViewPatentVisual(persistencePatentcounts2);
			listPatentVisual.add(viewPatentVisual);
		}
		return listPatentVisual;
	}
}
