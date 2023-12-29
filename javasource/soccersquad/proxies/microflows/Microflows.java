// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package soccersquad.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the SoccerSquad module
	public static void aCT_Goal_Commit(IContext context, soccersquad.proxies.Goal _goal)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Goal", _goal == null ? null : _goal.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Goal_Commit").withParams(params).execute(context);
	}
	public static void aCT_Match_Commit(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Match_Commit").withParams(params).execute(context);
	}
	public static void aCT_Match_TestDates(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Match_TestDates").withParams(params).execute(context);
	}
	public static void aCT_Person_OpenEditPage(IContext context, soccersquad.proxies.Person _person)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Person", _person == null ? null : _person.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Person_OpenEditPage").withParams(params).execute(context);
	}
	public static void aCT_Player_CreateNew(IContext context, soccersquad.proxies.Team _team)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Team", _team == null ? null : _team.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Player_CreateNew").withParams(params).execute(context);
	}
	public static void aCT_Score_AddGoal(IContext context, soccersquad.proxies.Team _team, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Team", _team == null ? null : _team.getMendixObject());
		params.put("Match", _match == null ? null : _match.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Score_AddGoal").withParams(params).execute(context);
	}
	public static void aCT_Team_CreateNew(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("SoccerSquad.ACT_Team_CreateNew").withParams(params).execute(context);
	}
	public static void aCT_Team_OpenEditPage(IContext context, soccersquad.proxies.Team _team)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Team", _team == null ? null : _team.getMendixObject());
		Core.microflowCall("SoccerSquad.ACT_Team_OpenEditPage").withParams(params).execute(context);
	}
	public static boolean aSU_GoMakeIt(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("SoccerSquad.ASU_GoMakeIt").withParams(params).execute(context);
	}
	public static soccersquad.proxies.MatchStats dS_Match_GetMatchStats(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("SoccerSquad.DS_Match_GetMatchStats").withParams(params).execute(context);
		return result == null ? null : soccersquad.proxies.MatchStats.initialize(context, result);
	}
	public static void sUB_CreateAccount(IContext context, java.lang.String _userName, system.proxies.UserRole _userRole)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserName", _userName);
		params.put("UserRole", _userRole == null ? null : _userRole.getMendixObject());
		Core.microflowCall("SoccerSquad.SUB_CreateAccount").withParams(params).execute(context);
	}
	public static boolean sUB_Goal_Validate(IContext context, soccersquad.proxies.Goal _goal)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Goal", _goal == null ? null : _goal.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("SoccerSquad.SUB_Goal_Validate").withParams(params).execute(context);
	}
	public static java.lang.String sUB_Match_CalculateMinutesPlayed(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		return (java.lang.String) Core.microflowCall("SoccerSquad.SUB_Match_CalculateMinutesPlayed").withParams(params).execute(context);
	}
	public static java.lang.Long sUB_Match_GetMinute(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		return (java.lang.Long) Core.microflowCall("SoccerSquad.SUB_Match_GetMinute").withParams(params).execute(context);
	}
	public static void sUB_Match_SetStadium(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		Core.microflowCall("SoccerSquad.SUB_Match_SetStadium").withParams(params).execute(context);
	}
	public static boolean sUB_Match_Validate(IContext context, soccersquad.proxies.Match _match)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Match", _match == null ? null : _match.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("SoccerSquad.SUB_Match_Validate").withParams(params).execute(context);
	}
	public static void sUB_Team_CreateLogo(IContext context, soccersquad.proxies.Team _team)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Team", _team == null ? null : _team.getMendixObject());
		Core.microflowCall("SoccerSquad.SUB_Team_CreateLogo").withParams(params).execute(context);
	}
}