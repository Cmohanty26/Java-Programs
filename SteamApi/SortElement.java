package com.SteamApi;

public class SortElement {

	public static void main(String[] args) {
		String s="jaavaa";
		s.chars().sorted().mapToObj(c->(char)c).
		forEach(c->System.out.print(c));

	}

}
