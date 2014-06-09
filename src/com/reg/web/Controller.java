/**
 *
 */
package com.reg.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reg.action.ClientAction;

/**
 * @author hao
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Controller() {
	super();

    }

    @Override
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	String action = request.getParameter("action");

	System.out.println("2311 Controller Invoked!");

	boolean result = false;

	System.out.println("2311 " + action);

	switch (action) {
	case "createNewClient":

	    /*
	     * Mapping parameters to object
	     */

	    System.out.println("2311 Case: " + action);

	    ClientAction ca = new ClientAction();

	    // validations
	    int zip;
	    try {
		zip = Integer.parseInt(request.getParameter("zip"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		zip = 0;
	    }

	    int ad = 0;
	    try {
		zip = Integer.parseInt(request.getParameter("ad"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		ad = 0;
	    }

	    long hp;
	    try {
		hp = Long.parseLong(request.getParameter("hp"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		hp = 0;
	    }

	    long wp;
	    try {
		wp = Long.parseLong(request.getParameter("wp"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		wp = 0;
	    }

	    long cp;
	    try {
		cp = Long.parseLong(request.getParameter("cp"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		cp = 0;
	    }

	    int Month = 0;
	    try {
		Month = Integer.parseInt(request.getParameter("Month"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		Month = 0;
	    }

	    int Day = 0;
	    try {
		Day = Integer.parseInt(request.getParameter("Day"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		Day = 0;
	    }

	    int Year = 0;
	    try {
		Year = Integer.parseInt(request.getParameter("Year"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		Year = 0;
	    }

	    int Age = 0;
	    try {
		Age = Integer.parseInt(request.getParameter("Age"));
	    } catch (NumberFormatException the_input_string_isnt_an_integer) {
		Age = 0;
	    }

	    result = ca.createNewClient(request.getParameter("fn"),
		    request.getParameter("ln"), request.getParameter("cn"), ad,
		    request.getParameter("no"), request.getParameter("street"),
		    request.getParameter("city"), zip, hp, wp, cp,
		    request.getParameter("email"),
		    request.getParameter("resi"),
		    request.getParameter("resio"), request.getParameter("sg"),
		    Month, Day, Year, Age, request.getParameter("gender"),
		    request.getParameter("COB"), request.getParameter("COBo"),

		    request.getParameter("input_32.2"),
		    request.getParameter("input_32.3"),
		    request.getParameter("input_32.4"),
		    request.getParameter("input_32.5"),

		    request.getParameter("input_22.6"),
		    request.getParameter("input_33.2"),
		    request.getParameter("input_33.3"),
		    request.getParameter("input_33.4"),
		    request.getParameter("input_23.6"),

		    request.getParameter("input_34.2"),
		    request.getParameter("input_34.3"),
		    request.getParameter("input_34.4"),
		    request.getParameter("input_24.6"));

	    /*
	     * Para list: list: fn fname ln lname cn cname ad num no street
	     * street city city state zip zip hp hphone wp wphone cp cphone
	     * email email resi residence resio residence->overriden sg groups
	     * {ADS PT HC None} Month month Day day Year year Age age gender
	     * gender {Male Female} COB CoB COBo CoB ->overriden input_32.2
	     * saEnglish {Vegetarian} input_32.3 saPutonghua {Gluten Free
	     * input_32.4 saguangdonghua {Allergies input_32.5 sataishanhua
	     * {Other input_22.6 sp input_32.2 raEnglish {English input_32.3
	     * rajiantizhongwen {Gluten Free input_32.4 rafanti {Allergies
	     * input_22.6 rp input_32.2 waEnglish {English input_32.3
	     * wajiantizhongwen {Gluten Free input_32.4 wafanti {Allergies
	     * input_22.6 wp comment ?
	     */

	    if (result == true) {

		System.out.println("Creation Succeed.");

	    } else {
		System.out.println("Creation Failed.");
	    }

	    break;
	}

    }

    @Override
    protected void doPost(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {
	this.doGet(request, response);
    }

}
