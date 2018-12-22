package com.examples.linkedLists;

public class LinkedListExamples {
	
	Node head;
	public int length(){
		Node Current=head;
		int length=0;
		while(Current.next!=null){
			length++;
		}
		return length;
	}
	
	public String toString(){
		
		Node current=head;
		StringBuilder sb= new StringBuilder();
		
		while(current!=null){
		sb.append(current).append("-->");
		current=current.next;
		}
		if(sb.length()>=3){
			sb.delete(sb.length()-3,sb.length());
		}
		System.out.println(" The sb length "+sb.length());
		return sb.toString();
		
	}
	
	public  <T> void append(T data){
		
		if(head==null){
		   head = new Node(data);
			return;
		}
		else{
			tail().next=new Node(data);			
		}
	}
	
	public Node tail(){
		Node tail=head;
		while(tail.next!=null){
			tail=tail.next;
		}
		return tail;
	}
	
	
	public static class Node<T>{
		   Node next;
		   T data;
		   
		   public Node(T data){
			   this.data=data;
		   }
		    @Override
		   public String toString(){
			  return data.toString(); 
		   }
		   
	}


}
