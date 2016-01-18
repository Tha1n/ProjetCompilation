#include "BinTree.h"
#include <iostream>
#include <vector>

std::vector<BinTree> f0(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_2, v_0,_>
BinTree v_2 = v_0;

//<AFF, v_3, v_0,_>
BinTree v_3 = v_0;

//<CONS, v_1, v_2,v_3>
BinTree v_1 = BinTree::cons(v_2, v_3);
//<AFF, v_0, v_1,_>
v_0 = v_1;


//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}

std::vector<BinTree> f1(std::vector<BinTree> args)
{
	//Read
BinTree v_0 = args.size() < 0? BinTree() : args.at(0);
//Instructions
//<AFF, v_4, v_0,_>
BinTree v_4 = v_0;

//<CALL, v_5, f0,v_4>
BinTree v_5 = f0(v_4).at(0);
//<AFF, v_0, v_5,_>
v_0 = v_5;


//write
std::vector<BinTree> retour;
retour.push_back(v_0);
return retour;
}


int main(int argc, char *argv[]) {
std::vector<BinTree> entry;
argc > 1? entry.push_back(BinTree(argv[1])) : entry.push_back(BinTree());

std::vector<BinTree> result = f1(entry);
	for(auto bT : result)
		std::cout << bT << std::endl;
	return 0;
}