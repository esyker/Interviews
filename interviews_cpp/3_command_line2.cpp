/*The purpose of this problem is to verify whether the method you are using to 
read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. 
You are expected to be able to process at least 2.5MB of input data per second at runtime.

Input
The input begins with two positive integers n k (n, k<=107). 
The next n lines of input contain one positive integer ti, not greater than 109, each.

Output
Write a single integer to output, denoting how many integers ti are divisible by k.*/

// A fast IO program
#include <bits/stdc++.h>
using namespace std;

int main()
{
	// added the two lines below
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n, k, t;
	int cnt = 0;
	cin >> n >> k;
	for (int i=0; i<n; i++)
	{
		cin >> t;
		if (t % k == 0)
			cnt++;
	}
	cout << cnt << "\n";
	return 0;
}
