public class ContaCorrente extends Conta {
        public ContaCorrente(int agencia, int numero) {
            super(agencia, numero);
        }

        @Override //  É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
        public boolean saca(double valor) { // estava escrito sacar, override mudou para saca
        	// TODO Auto-generated method stub
            double valorASacar = valor + 0.2;
            return super.saca(valorASacar);
        }
}