package com.github.supermarcel10;

public class Test {
	public static void main(String[] args) {
		testCheckClause();
		testCheckClauseDatabase();
		testCheckClausePartial();
		testFindUnit();
	}

	private static void testCheckClause() {
		Solver solver = new Solver();
		// Test case 1
		int[] assignment = {0, 1, -1, 1};
		int[] clause = {1, -2, 3};
		boolean result = solver.checkClause(assignment, clause);
		System.out.println("Test checkClause 1: " + (result ? "PASSED" : "FAILED"));

		// Add more test cases here
	}

	private static void testCheckClauseDatabase() {
		Solver solver = new Solver();
		// Test case 1
		int[] assignment = {0, 1, -1, 1};
		int[][] clauseDatabase = {{1, -2}, {-1, -2, 3}, {2}};
		boolean result = solver.checkClauseDatabase(assignment, clauseDatabase);
		System.out.println("Test checkClauseDatabase 1: " + (result ? "PASSED" : "FAILED"));

		// Add more test cases here
	}

	private static void testCheckClausePartial() {
		Solver solver = new Solver();
		// Test case 1
		int[] partialAssignment = {0, 1, 0, -1};
		int[] clause = {1, -2, 3};
		int result = solver.checkClausePartial(partialAssignment, clause);
		System.out.println("Test checkClausePartial 1: " + (result == 1 ? "PASSED" : "FAILED"));

		// Add more test cases here
	}

	private static void testFindUnit() {
		Solver solver = new Solver();
		// Test case 1
		int[] partialAssignment = {0, 1, 0, -1};
		int[] clause = {1, -2, 3};
		int result = solver.findUnit(partialAssignment, clause);
		System.out.println("Test findUnit 1: " + (result == -2 ? "PASSED" : "FAILED"));

		// Add more test cases here
	}
}