public class PilhaInt {
	public final int  N = 6;

	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}
	
	public void push(int elem) {
		if (!isFull()) {
			dados[topo]=elem;
			topo++;
		}
		else
			System.out.println("stack overflow");
	}
	
	public boolean isEmpty() {
		if (topo ==0)
			return true;
		else
			return false;
	}
	
	public static class RetornoInt{
		int elem;
		boolean sucesso;
	}
	
	public RetornoInt pop() {
		RetornoInt saida = new RetornoInt();
		if (!isEmpty()) {
			topo--;
			saida.elem= dados[topo];
			saida.sucesso = true;
			}
		else {
			
			saida.sucesso = false;
			}
		return saida;
	}
	
	public RetornoInt top() {
		RetornoInt saida = new RetornoInt();
		if (!isEmpty()) {
			saida.elem= dados[topo-1];
			saida.sucesso = true;
			}
		else {
			
			saida.sucesso = false;
			}
		return saida;
	}
	
	public void esvazia() {
		RetornoInt res = new RetornoInt();
		while (!isEmpty()) {
			res = pop();
			System.out.println(res.elem);
			}
	}
}
