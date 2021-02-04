package PilhaLista;

public class NoLista {

	private Object info;
	private NoLista next;
	
	public NoLista() {
		info = null;
		next = null;
	}
	
	public NoLista(Object info, NoLista next) {
		this.info = info;
		this.next = next;
	}
	
	public Object getInfo() {
		return info;
	}
	
	public void setInfo(Object info) {
		this.info = info;
	}
	
	public NoLista getNext() {
		return next;
	}
	
	public void setNext(NoLista next) {
		this.next = next;
	}
	
	public String toString() {
		return toString();
	}
}