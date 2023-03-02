package com.CollectionProject.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CollectionProject.Controller.Admin;
import com.CollectionProject.Model.Batch;
import com.CollectionProject.Model.Course;
import com.CollectionProject.Model.Faculty;
import com.CollectionProject.Model.Student;
import com.CollectionProject.Service.Service;

public class ServiceIMPL implements Service {
	Scanner sc = new Scanner(System.in);
	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Student> slist = new ArrayList<Student>();

	@Override
	public void addCourse() {

//		 System.out.println("How Many Course you want To add :- ");
		int cn = getValidCourse();

		for (int i = 1; i <= cn; i++) {
			Course c = new Course();
//			System.out.println("Enter the Course-id :- ");
			c.setCid(getValidCid());
			System.out.println("Enter the Course-Name:- ");
			c.setCname(sc.next());

			clist.add(c);
		}

	}

	private int getValidCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Course you want To add :- ");
		int cid;
		try {
			cid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidCid();
		}
		return cid;
	}

	private int getValidCid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Course ID :- ");
		int cid = 0;
		try {
			cid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidCid();
		}
		return cid;
	}

	@Override
	public void displayCourse() {

		for (Course c : clist) {
			System.out.println("----------------------------------------");
			System.out.println("course ID :- " + c.getCid());
			System.out.println("Course Name :- " + c.getCname());
			System.out.println("----------------------------------------");
		}

	}

	@Override
	public void addFaculty() {
//		System.out.println("How Many faculty you want To add :- ");
		int cn = getValidFaculty();
		for (int i = 1; i <= cn; i++) {
			Faculty f = new Faculty();

			f.setFid(getValidFid());
			System.out.println("Enter the faculty-Name:- ");
			f.setFname(sc.next());

			displayCourse();
			System.out.println("Enter the course ID you want to add:- ");
			int cid = getValidCid();
			for (Course c : clist) {

				if (cid == c.getCid()) {
					f.setCourse(c);
				}
			}

			flist.add(f);
		}

	}

	private int getValidFaculty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Faculty you want To add :- ");
		int fid;
		try {
			fid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidFaculty();
		}
		return fid;
	}

	private int getValidFid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the faculty-id :- ");
		int fid = 0;
		try {
			fid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidCid();
		}
		return fid;
	}

	@Override
	public void displayFaculty() {
		for (Faculty f : flist) {
			System.out.println("----------------------------------------");
			System.out.println("Faculty ID :- " + f.getFid());
			System.out.println("Faculty Name :- " + f.getFname());
			System.out.println("Faculty CourseID :- " + f.getCourse().getCid());
			System.out.println("Faculty CourseName :- " + f.getCourse().getCname());
			System.out.println("----------------------------------------");
		}
	}

	@Override
	public void addBatch() {

		int cn = getValidBatch();

		for (int i = 1; i <= cn; i++) {
			Batch b = new Batch();
			b.setBid(getValidBid());

			System.out.println("Enter the Batch-Name:- ");
			b.setBname(sc.next());

			displayFaculty();

			System.out.println("Enter the Batch you want to add:- ");
			int fid = getValidFid();

			for (Faculty f : flist) {
				if (fid == f.getFid()) {
					b.setFaculty(f);
				}
			}
			blist.add(b);
		}
	}

	private int getValidBatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Batch you want To add :- ");
		int bid;
		try {
			bid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidBatch();
		}
		return bid;
	}

	private int getValidBid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Batch-id :- ");
		int bid = 0;
		try {
			bid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidBid();
		}
		return bid;
	}

	@Override
	public void displayBatch() {
		for (Batch b : blist) {
			System.out.println("----------------------------------------");
			System.out.println("batch ID :- " + b.getBid());
			System.out.println("batch Name :- " + b.getBname());
			System.out.println("Faculty ID :- " + b.getFaculty().getFid());
			System.out.println("Faculty Name:- " + b.getFaculty().getFname());
			System.out.println("Course ID:- " + b.getFaculty().getCourse().getCid());
			System.out.println("Course Name :- " + b.getFaculty().getCourse().getCname());
			System.out.println("----------------------------------------");
		}

	}

	@Override
	public void addStudent() {
//		System.out.println("How Many Student you want To add :- ");
		int cn = getValidStudent();
		for (int i = 1; i <= cn; i++) {
			Student s = new Student();
//			System.out.println("Enter the Student-id :- ");
			s.setSid(getValidSid());
			System.out.println("Enter the Student-Name:- ");
			s.setSname(sc.next());

			displayBatch();

			System.out.println("Enter the BatchID you want to add:- ");
			int bid = sc.nextInt();
			for (Batch b : blist) {
				if (bid == b.getBid()) {
					s.setBatch(b);
				}
			}
			slist.add(s);
		}
	}

	private int getValidStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Student you want To add :- ");
		int sid;
		try {
			sid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidStudent();
		}
		return sid;
	}

	private int getValidSid() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student-id :- ");
		int sid = 0;
		try {
			sid = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
			return getValidSid();
		}
		return sid;
	}

	@Override
	public void displayStudent() {
		for (Student s : slist) {
			System.out.println("----------------------------------------");
			System.out.println("Student  ID :- " + s.getSid());
			System.out.println("Student  Name :- " + s.getSname());
			System.out.println("Batch ID :- " + s.getBatch().getBid());
			System.out.println("Batch Name :- " + s.getBatch().getBname());
			System.out.println("Faculty ID :- " + s.getBatch().getFaculty().getFid());
			System.out.println("Faculty name:- " + s.getBatch().getFaculty().getFname());
			System.out.println("Course ID :- " + s.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Course Name:- " + s.getBatch().getFaculty().getCourse().getCname());
			System.out.println("----------------------------------------");
		}

	}

	private int getValidCourseID() {
		System.out.println("Enter the Course ID:-");
		int id = sc.nextInt();
		boolean flag = false;
		for (Course c : clist) {

			if (id == c.getCid()) {
				flag = true;
			}

		}

		if (!flag) {
			System.out.println("ID Not Present!!!!");
			return getValidCourseID();
		}
		return id;

	}

	private int getValidFacultyID() {
		System.out.println("Enter the Faculty ID:-");
		int id = sc.nextInt();
		boolean flag = false;
		for (Faculty f : flist) {

			if (id == f.getFid()) {
				flag = true;
			}

		}

		if (!flag) {
			System.out.println("ID Not Present!!!!");
			return getValidFacultyID();
		}
		return id;

	}

	private int getValidBatchID() {
		System.out.println("Enter the Batch ID:-");
		int id = sc.nextInt();
		boolean flag = false;
		for (Batch b : blist) {

			if (id == b.getBid()) {
				flag = true;
			}

		}

		if (!flag) {
			System.out.println("ID Not Present!!!!");
			return getValidBatchID();
		}
		return id;

	}

	private int getValidStudentID() {
		System.out.println("Enter the Student ID:-");
		int id = sc.nextInt();
		boolean flag = false;
		for (Student s : slist) {

			if (id == s.getSid()) {
				flag = true;
			}

		}

		if (!flag) {
			System.out.println("ID Not Present!!!!");
			return getValidStudentID();
		}
		return id;

	}

	@Override
	public void updateFunctions() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1.Update Course");
			System.out.println("2.Update Faculty");
			System.out.println("3.Update Batch");
			System.out.println("4.update Student");
			System.out.println("5.Exit");

			int ch = Admin.getchoice();

			switch (ch) {
			case 1:
				System.out.println("----Update Course Details------");
				displayCourse();
				int did = getValidCourseID();
				System.out.println("Enter the New Course Name:-");
				String ncname = sc.next();
				for (Course c : clist) {
					if (did == c.getCid()) {
						c.setCname(ncname);
					}
				}
				System.out.println("New Course Name updated Successfullly!!!! ");

				break;
			case 2:
				System.out.println("----Update Faculty Details------");
				displayFaculty();
				int fdid = getValidFacultyID();
				System.out.println("Enter the New Faculty Name:-");
				String nfname = sc.next();
				for (Faculty f : flist) {
					if (fdid == f.getFid()) {
						f.setFname(nfname);
					}
				}
				System.out.println("New Faculty Name updated Successfullly!!!! ");
				break;

			case 3:
				System.out.println("----Update Batch Details------");
				displayBatch();
				int bdid = getValidBatchID();
				System.out.println("Enter the New Batch Name:-");
				String nbname = sc.next();
				for (Batch b : blist) {
					if (bdid == b.getBid()) {
						b.setBname(nbname);
					}
				}
				System.out.println("New Batch Name updated Successfullly!!!! ");
				break;
			case 4:
				System.out.println("----Update Student Details------");
				displayStudent();
				boolean status = true;
				while (status) {
					System.out.println("--------What You Want TO Change--------------");
					System.out.println("1.student Name");
					System.out.println("2.Student Batch");
					System.out.println("3.Exit");
					System.out.println("Enter your choice:-");
					int cn = sc.nextInt();
					switch (cn) {
					case 1:
						int sdid = getValidStudentID();
						System.out.println("Enter the New Student Name:-");
						String nsname = sc.next();
						for (Student s : slist) {
							if (sdid == s.getSid()) {
								s.setSname(nsname);

							}
						}

						break;
					case 2:
						displayBatch();
						System.out.println("Enter the Batch ID of this Student:-");
						int id = getValidBatchID();

						for (Student s : slist) {
							if (id == s.getBatch().getBid()) {

								displayBatch();

								System.out.println("Enter the BatchID you want to add:- ");
								int bid = sc.nextInt();
								for (Batch b : blist) {
									if (bid == b.getBid()) {
										s.setBatch(b);
									}
								}

							}
						}
						break;

					case 3:
						status = false;
						break;
					default:
						System.out.println("Invalid Input");
						break;
					}
				}

				System.out.println("New Student Name updated Successfullly!!!! ");
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invlaid Choice!!");
				break;
			}
		}

	}

	@Override
	public void deleteFunctions() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1.Delete Course");
			System.out.println("2.Delete Faculty");
			System.out.println("3.Delete Batch");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");

			int ch = Admin.getchoice();

			switch (ch) {
			case 1:
				System.out.println("---- Course Details------");
				displayCourse();
				int did = getCourseDeleteID();

				clist.remove(did);

				System.out.println(" Course deleted Successfullly!!!! ");

				break;
			case 2:
				System.out.println("---- Faculty Details------");
				displayFaculty();
				int fdid = getFacultyDeleteID();
				flist.remove(fdid);
				System.out.println("Faculty deleted Successfullly!!!! ");
				break;

			case 3:
				System.out.println("---- Batch Details------");
				displayBatch();
				int bdid = getBatchDeleteID();
				blist.remove(bdid);
				System.out.println("Batch deleted Successfullly!!!! ");
				break;
			case 4:
				System.out.println("----Update Student Details------");
				displayStudent();
				int sdid = getStudentDeleteID();
				slist.remove(sdid);
				System.out.println("New Student Name updated Successfullly!!!! ");
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invlaid Choice!!");
				break;
			}
		}

	}

	private int getCourseDeleteID() {
		System.out.println("Enter the id:-");
		int deletecourseid = getValidCourseID();
		int count = 0;
		for (Course c : clist) {
			if (c != null && deletecourseid == c.getCid()) {
				break;
			} else {
				count++;

			}
		}

		return count;
	}

	private int getFacultyDeleteID() {
		System.out.println("Enter the id:-");
		int deletefacultyid = getValidFacultyID();
		int count = 0;

		for (Faculty f : flist) {
			if (f != null && deletefacultyid == f.getFid()) {
				break;
			} else {
				count++;
			}
		}

		return count;
	}

	private int getBatchDeleteID() {
		System.out.println("Enter the id:-");
		int deleteBatchid = getValidBatchID();
		int count = 0;

		for (Batch b : blist) {
			if (b != null && deleteBatchid == b.getBid()) {
				break;
			} else {
				count++;
			}
		}

		return count;
	}

	private int getStudentDeleteID() {
		System.out.println("Enter the id:-");
		int deleteBatchid = getValidStudentID();
		int count = 0;

		for (Student s : slist) {
			if (s != null && deleteBatchid == s.getSid()) {
				break;
			} else {
				count++;
			}
		}

		return count;
	}

}
