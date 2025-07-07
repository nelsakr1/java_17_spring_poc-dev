package com.nrs.portal.tjx.crossdock.constants;

public interface ControllerConstants {

    /** The Constant EXTENSION. */
    String	EXTENSION						= "";

    /** The Constant act_as. */
    String	ACT_AS							= "/tjx/act_as";

    /** The Constant reset. */
    String	RESET							= "/tjx/reset";

    /** The Constant setup. */
    String	SETUP							= "/tjx/setup";

    /** The Constant doreview. */
    String	DOREVIEW						= "/tjx/doreview";

    /** The Constant inquiry. */
    String	INQUIRY							= "/tjx/inquiry";

    /** The Constant LOGIN. */
    String	LOGIN							= "/tjx/login";

    /** The Constant init. */
    String	INIT							= "/tjx/init";

    /** The Constant failure. */
    String	FAILURE							= "/tjx/failure";

    /** The Constant submit. */
    String	SUBMIT							= "/tjx/success";

    /** The Constant review. */
    String	REVIEW							= "/tjx/review";

    /** The Constant confirmation. */
    String	CONFIRMATION					= "/tjx/confirmation";

    /** The Constant update. */
    String	UPDATE							= "/tjx/update";

    /** The Constant print. */
    String	PRINT							= "/tjx/print";

    /** The delete_confirmation. */
    String	DELETE_CONFIRMATION				= "/tjx/delete_confirmation";

    /** The Constant dc_header. */
    String	DC_HEADER						= "/admin/dc_header";
    String	DC_HEADER_PAGE					= "/admin/dc_header_page";

    /** The Constant dc_detail. */
    String	DC_DETAIL						= "/admin/dc_detail";
    String	DC_DELETE						= "/admin/dc_delete";

    /** The Constant eta_header. */
    String	ETA_HEADER						= "/admin/eta_header";

    /** The Constant eta_detail. */
    String	ETA_DETAIL						= "/admin/eta_detail";

    /** The Constant carrier_header. */
    String	CARRIER_HEADER					= "/admin/carrier_header";

    /** The Constant carrier_detail. */
    String	CARRIER_DETAIL					= "/admin/carrier_detail";

    /** The Constant user_header. */
    String	USER_HEADER						= "/admin/user_header";

    /** The Constant user_detail. */
    String	USER_DETAIL						= "/admin/user_detail";

    /** The Constant admin_header. */
    String	ADMIN_HEADER					= "/admin/admin_header";

    /** The Constant admin_detail. */
    String	ADMIN_DETAIL					= "/admin/admin_detail";

    /** The Constant in_transit_by_destination. */
    String	IN_TRANSIT_BY_DESTINATION		= "/report/in_transit_by_destination";

    /** The Constant exception_by_eta. */
    String	EXCEPTION_BY_ETA				= "/tjx/exception_by_eta";

    /** The Constant exception_by_schedule_pickup. */
    String	EXCEPTION_BY_SCHEDULE_PICKUP	= "/tjx/exception_by_schedule_pickup";

    /** The Constant dc_email_header. */
    String	DC_EMAIL_HEADER					= "/admin/dc_email_header";

    /** The Constant dc_email_detail. */
    String	DC_EMAIL_DETAIL					= "/admin/dc_email_detail";

    /** The Constant eta_hour_header. */
    String	ETA_HOUR_HEADER					= "/admin/eta_hour";

    /** The Constant late_arrival. */
    String	LATE_ARRIVAL					= "/report/late_arrival";

    /** The Constant late_pickup. */
    String	LATE_PICKUP						= "/report/late_pickup";

    /** The Constant late_empty. */
    String	LATE_EMPTY						= "/report/late_empty";

    /** The missing pickup date. */
    String	MISSING_PICKUP_DATE				= "/report/missing_pickup_date";

    /** The Constant admin_header. */
    String	RUN_SCHEDULER_METHOD					= "/admin/run_sch_method";

    String	IN_YARD_NOT_PICKED_UP				= "/report/in_yard_not_picked_up";

    String	IN_YARD_NOT_UNLOADED				= "/report/in_yard_not_unloaded";

    String	ORIGIN_POINT_FORECASTED_LOADS				= "/report/origin_point";

    String	IN_TRANSIT_AND_IN_YARD				= "/report/in_transit_in_yard";

    String	GET_ALL_TJX_CONSTANT	= "/admin/all_tjx_constant";

    String	EXCEPTION_REPORT				= "/report/exception_report";
}