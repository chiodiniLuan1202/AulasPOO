package lista3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListaComEncadeamento {
	
	private NoLista first;
	private NoLista last;
	private int counter;
	
	public void ListaComEncadeamento(){
		
		first = null;
		last =  null;
		counter = 0;
		
	}
	
	public void add(Integer info) {
		
		NoLista obj =  new NoLista(info, null);
		//a lista esta vazia
		if(counter == 0) {
			first = obj;
			last =  obj;
		}else {
			//a lista não esta vazia
			this.last =  obj.getNext();
		}
		counter++;
	}
	
	public void add(Integer index, Integer info) {
		try {	
			NoLista obj =  new NoLista(null, null);
			NoLista temp =  first;
			counter = 0;
			
			while(counter != (index-1)) {
				temp = temp.getNext();
				counter++;
			}
			
			obj.setNext(temp.getNext());
			temp.setNext(obj);
		}catch(Exception a){
			System.out.println("O seguinte erro foi encontrado: " + a.getMessage());
		}
	}
	public Integer remove(int index) {		
		try {
			NoLista obj =  new NoLista(null, null);
			NoLista temp =  first;
			NoLista ant = first;
			
			counter =  0;
			
			while(counter != (index -1)) {
				ant= ant.getNext();
				counter++;
			}
			ant.setNext(null);
			ant.setNext(temp.getNext());

		}catch(Exception b){
			 System.out.println("O seguinte erro foi encontrado: " + b.getMessage());
		}
		return index ;
		
	}
		
	public boolean removeFirst(Integer  info) {
			try {
				NoLista obj =  new NoLista(null, null);
				NoLista temp =  first;
				NoLista ant = first;
				
				counter =  0;
				
				while (info == obj.getInfo() ) {
					ant= ant.getNext();
					counter++;
				}
				ant.setNext(null);
				ant.setNext(temp.getNext());
				
				return true;
			}catch(Exception c){
				 System.out.println("O seguinte erro foi encontrado: " + c.getMessage());
				 return false;
			}
	}
		
	public Integer get(int index) {
		try {
			NoLista obj =  new NoLista(null, null);
			NoLista temp =  first;
			
			while(counter!=index) {
				temp.getNext();
				counter ++;
			}
			Integer info = temp.getInfo();
			return info;
			
		}catch(Exception d) {
			System.out.println("O seguinte erro foi encontrado: " + d.getMessage());
			return null; 
		}
	}
	
	public void clear() {
		first =  null;
		last = null;
		counter = 0;
	}
	
	public Integer set(int index, Integer info) {
		try {
			NoLista obj =  new NoLista(null, null);
			NoLista temp =  first;
			
			while(counter!=index){
				temp.getNext();
				counter ++;
			}
			temp.setInfo(info);
			Integer mudanca = temp.getInfo();
			
			return mudanca;
		}catch(Exception e) {
			System.out.println("O seguinte erro foi encontrado: " + e.getMessage());
			return null; 
		}
	}
	
	public int size() {
		return counter;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public boolean contains(Integer info) { 
		try{
			NoLista obj =  new NoLista(null, null);
			NoLista temp =  first;
			
			counter =  0;
			
			while(info != obj.getInfo()) {
				temp= temp.getNext();
				counter++;
			}
			
			return true;
		}catch(Exception f) {
			System.out.println("O seguinte erro foi encontrado: " + f.getMessage());
			return false;
		}
	}
	
	public int indexOf(Integer info) {
		try {
			NoLista obj =  new NoLista(null, null);
			while(info != obj.getInfo()) {
				counter++;
			}
			return counter;
		}catch (Exception g) {
			return -1;
		}
	}
	
	public int lastIndexOf(Integer info) {
		try {
			NoLista obj =  new NoLista(null, null);
			int count = 0;
			
			while(obj.getNext() != last ) {
				if(obj.getInfo() == info) {
					Integer ultimo = count; 
				}
				count++;
			}
			return count;
		}catch (Exception g) {
			return -1;
		}
	}
	
	public Integer[] toArray() {
		
		Integer[] lista = new Integer[counter];
		NoLista aux = first;
		int cont = 0;
		
		while(aux != null) {
			lista.clone();
			aux= aux.getNext();
			cont++;
		}
		return lista;
	}
	
	
}
