/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodges.silva
 */
public class Canela extends CafeDecorator{
           public Canela(Cafe cafe) {
		super(cafe);
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Canela");

	}
}
