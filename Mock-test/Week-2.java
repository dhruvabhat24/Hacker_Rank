/*
* Complete the 'flippingMatrix' function below.
*
* The function is expected to return an INTEGER.
* The function accepts 2D_INTEGER_ARRAY matrix as parameter.
*/
function flippingMatrix(matrix) {
 let n = matrix.length - 1;
 let m = n / 2;
 let sum = 0;
 for (let i = 0; i < m; i++) {
 for (let j = 0; j < m; j++) {
 sum += Math.max(matrix[i][j], matrix[i][n - j], matrix[n - i][j],
matrix[n - i][n - j]);
 }
 }
 
 return sum;
}
