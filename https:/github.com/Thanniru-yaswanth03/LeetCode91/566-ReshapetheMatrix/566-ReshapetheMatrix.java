// Last updated: 9/10/2026, 8:32:51 PM
/*
 * Why is this a 2D Array & Math problem?
 *
 * The key observation is that reshaping does NOT change the order
 * of the elements. It only changes how they are grouped into rows.
 *
 * Example:
 *
 * Original Matrix (2 x 2):
 *
 *      1  2
 *      3  4
 *
 * If we read the matrix in row-traversing order, we get:
 *
 *      1 -> 2 -> 3 -> 4
 *
 * This sequence never changes.
 *
 * Now reshape it into a (1 x 4) matrix:
 *
 *      1  2  3  4
 *
 * Notice that only the row and column boundaries changed.
 * The order of elements remained exactly the same.
 *
 * Therefore, we can imagine BOTH matrices as a single
 * linear array of length m × n.
 *
 * Every element has a unique linear index:
 *
 * Linear Index : 0  1  2  3
 * Elements     : 1  2  3  4
 *
 * For every linear index i:
 *
 * Original Matrix Position
 *      row = i / originalColumns
 *      col = i % originalColumns
 *
 * Reshaped Matrix Position
 *      row = i / newColumns
 *      col = i % newColumns
 *
 * Example:
 *
 * i = 2
 *
 * Original:
 *      row = 2 / 2 = 1
 *      col = 2 % 2 = 0
 *      -> mat[1][0] = 3
 *
 * Reshaped:
 *      row = 2 / 4 = 0
 *      col = 2 % 4 = 2
 *      -> res[0][2] = 3
 *
 * Thus, every element can be copied directly from its
 * original position to its new position using the SAME
 * linear index.
 *
 * Before reshaping, we must verify that the total number
 * of elements remains unchanged.
 *
 * If:
 *
 *      originalRows × originalCols
 *          !=
 *      newRows × newCols
 *
 * then reshaping is impossible because some elements would
 * either be lost or extra positions would remain empty.
 *
 * Therefore:
 * 1. Compute the total number of elements.
 * 2. If the totals differ, return the original matrix.
 * 3. Otherwise, iterate through every linear index.
 * 4. Map that index to both matrices using division and modulo.
 * 5. Copy the element into its new position.
 *
 * Since every element is visited exactly once and index mapping
 * directly gives its correct position, this is the simplest and
 * most efficient solution.
 */