// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package performancetest.proxies.microflows;

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

	// These are the microflows for the PerformanceTest module
	public static void aCT_GenerateALotOfTeamsAndStaff(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.ACT_GenerateALotOfTeamsAndStaff").withParams(params).execute(context);
	}
	public static void aCT_PlayerImportData(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.ACT_PlayerImportData").withParams(params).execute(context);
	}
	public static void aCT_Result_SearchStaff(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_Result_SearchStaff").withParams(params).execute(context);
	}
	public static void aCT_RetrieveStaffOfTeam_JoinEntity(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveStaffOfTeam_JoinEntity").withParams(params).execute(context);
	}
	public static void aCT_RetrieveStaffOfTeam_RefSet(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveStaffOfTeam_RefSet").withParams(params).execute(context);
	}
	public static void aCT_RetrieveStaffOfTeam_RefSetBoth(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveStaffOfTeam_RefSetBoth").withParams(params).execute(context);
	}
	public static void aCT_RetrieveTeams_JoinEntity(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveTeams_JoinEntity").withParams(params).execute(context);
	}
	public static void aCT_RetrieveTeams_RefSet(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveTeams_RefSet").withParams(params).execute(context);
	}
	public static void aCT_RetrieveTeams_RefSetBoth(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		Core.microflowCall("PerformanceTest.ACT_RetrieveTeams_RefSetBoth").withParams(params).execute(context);
	}
	public static void aCT_Staff_4_Count(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.ACT_Staff_4_Count").withParams(params).execute(context);
	}
	public static void aCT_Staff_CreateAlotOfStaff(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.ACT_Staff_CreateAlotOfStaff").withParams(params).execute(context);
	}
	public static java.util.List<performancetest.proxies.Staff_4> microflow(IContext context, performancetest.proxies.Result _result)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Result", _result == null ? null : _result.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("PerformanceTest.Microflow").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> performancetest.proxies.Staff_4.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static void sUB_DeleteAllTeamAndStaffData(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.SUB_DeleteAllTeamAndStaffData").withParams(params).execute(context);
	}
	public static void sUB_GenerateALotStaffAndTeams(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.SUB_GenerateALotStaffAndTeams").withParams(params).execute(context);
	}
	public static void sUB_GenerateALotStaffAndTeams_2(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.SUB_GenerateALotStaffAndTeams_2").withParams(params).execute(context);
	}
	public static void sUB_GenerateALotStaffAndTeams_3(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("PerformanceTest.SUB_GenerateALotStaffAndTeams_3").withParams(params).execute(context);
	}
	public static java.lang.String sUB_GetName(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("PerformanceTest.SUB_GetName").withParams(params).execute(context);
	}
	public static void sUB_Player_Create(IContext context, performancetest.proxies.PlayerImport _playerImport, java.util.List<soccersquad.proxies.Player> _playerList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PlayerImport", _playerImport == null ? null : _playerImport.getMendixObject());
		java.util.List<IMendixObject> listparam_playerList = null;
		if (_playerList != null)
		{
			listparam_playerList = new java.util.ArrayList<>();
			for (var obj : _playerList) {
				listparam_playerList.add(obj.getMendixObject());
			}
		}
		params.put("PlayerList", listparam_playerList);

		Core.microflowCall("PerformanceTest.SUB_Player_Create").withParams(params).execute(context);
	}
	public static java.util.List<performancetest.proxies.Staff> sUB_Staff_CreateTenStaff(IContext context, java.lang.Long _sequence)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Sequence", _sequence);
		java.util.List<IMendixObject> objs = Core.microflowCall("PerformanceTest.SUB_Staff_CreateTenStaff").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> performancetest.proxies.Staff.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<performancetest.proxies.Staff_2> sUB_Staff_CreateTenStaff_2(IContext context, java.lang.Long _sequence)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Sequence", _sequence);
		java.util.List<IMendixObject> objs = Core.microflowCall("PerformanceTest.SUB_Staff_CreateTenStaff_2").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> performancetest.proxies.Staff_2.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<performancetest.proxies.Staff_3> sUB_Staff_CreateTenStaff_3(IContext context, java.lang.Long _sequence)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Sequence", _sequence);
		java.util.List<IMendixObject> objs = Core.microflowCall("PerformanceTest.SUB_Staff_CreateTenStaff_3").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> performancetest.proxies.Staff_3.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
}
