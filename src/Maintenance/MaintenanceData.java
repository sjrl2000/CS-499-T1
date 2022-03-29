package Maintenance;

import java.util.*;

public class MaintenanceData 
{
  
    String inspection_date = "null";
    String inspection_type = "null";
    String repair_desc = "null";
    String parts = "null";
    String stock_order = "null";
    String order_loc = "null";
    float cost = 0;
    

    MaintenanceData(String i_date, String i_type, String r_desc, String p, String so, String ol, float c)
    {
        inspection_date = i_date;
        inspection_type = i_type;
        repair_desc = r_desc;
        parts = p;
        stock_order = so;
        order_loc = ol;
        cost = c;

    }

   
   String getIDate()
   {
        return inspection_date;
   }

   void setIDate(String id)
   {
        inspection_date = id;
   }

 String getIType()
   {
        return inspection_type;
   }

   void setIType(String type)
   {
        inspection_type = type;
   }

    String getRepairD()
   {
        return repair_desc;
   }

   void setRepairD(String desc)
   {
        repair_desc = desc;
   }

    String getPartsUsed()
   {
        return parts;
   }

   void setPartsUsed(String p)
   {
        parts = p;
   }

    String getStockOrder()
   {
        return stock_order;
   }

   void setStockOrder(String st_or)
   {
        stock_order = st_or;
   }

    String getOrderLocation()
   {
        return order_loc;
   }

   void setOrderLocation(String or_loc)
   {
        order_loc = or_loc;
   }

    float getCost()
   {
        return cost;
   }

   void setIDate(float c)
   {
        cost = c;
   }
    
}


