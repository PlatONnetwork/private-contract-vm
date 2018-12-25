#include "platon_integer.h"
#include "emp-tool/circuits/number.h"
#include "emp-tool/execution/plain_circ.h"
#include "emp-tool/execution/plain_prot.h"

using namespace platon::mpc;

void ham(int n) {
	Integer a(n, 0, ALICE);
	Integer b(n, 0, BOB);
	Integer c = a^b;
	Integer d = c.hamming_weight();
	d.reveal_string();
}

void mult(int n) {
	Integer a(n, 0, ALICE);
	Integer b(n, 0, BOB);
	Integer c = a*b;
	c.reveal_string();
}
void modexp(int n1, int n2) {
	Integer a(n1, 0,  ALICE);
	Integer b(n2, 0,  BOB);
	Integer c(n1, 5, ALICE);
	Integer d = a.modExp(b, c);
}
void sort(int n) {
	Integer *A = new Integer[n];
	Integer *B = new Integer[n];
	for(int i = 0; i < n; ++i)
		A[i] = Integer(32, 0, ALICE);
	for(int i = 0; i < n; ++i)
		B[i] = Integer(32, 0, BOB);
	for(int i = 0; i < n; ++i)
		(A[i]) = (A[i]) ^ (B[i]);
	sort(A, n);
	for(int i = 0; i < n; ++i)
		A[i].reveal_string();

	delete[]A;
	delete[]B;
}
int main(int argc, char** argv) {
	setup_plain_prot(true, "sort.txt");
	sort(128);	
//	mult(2048);
//	ham(1<<10);
	finalize_plain_prot ();
}
