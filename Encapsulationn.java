package Introduction;

class Zomato
{
    private String CustomerName;
    private double OrderAmount;
    private String DeliveryAddress;
    private String OrderStatus;

    // Getter and Setter for CustomerName
    public String getCustomerName() {
        return CustomerName;
    }
    
    public void setCustomerName(String customerName) {
        if(customerName != null && !customerName.isEmpty())
        {
            this.CustomerName = customerName;
        }
        else
        {
            System.out.println("Please provide a valid name.");
        }
    }
    
    // Getter and Setter for OrderAmount
    public double getOrderAmount() {
        return OrderAmount;
    }
    
    public void setOrderAmount(double orderAmount)
    {
        if(orderAmount > 0)
        {
            this.OrderAmount = orderAmount;
        }
        else
        {
            System.out.println("Enter a valid order amount.");
        }
    }
    
    // Getter and Setter for DeliveryAddress
    public String getDeliveryAddress()
    {
        return DeliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        if(deliveryAddress != null && !deliveryAddress.isEmpty())
        {
            this.DeliveryAddress = deliveryAddress;
        }
        else
        {
            System.out.println("Please provide a valid address.");
        }
    }
    
    // Order Status
    public String getOrderStatus()
    {
        return OrderStatus;
    }
    
    public void checkOrderStatus()
    {
        if(CustomerName != null && DeliveryAddress != null && !DeliveryAddress.isEmpty())
        {
            OrderStatus = "Done";
            System.out.println("Order Status: " + OrderStatus);
        }
        else
        {
            System.out.println("Order Is not Done. Missing details.");
        }
    }
}

public class Encapsulationn {
    public static void main(String[] args)
    {
        Zomato z = new Zomato();
        
        z.setCustomerName("Rahul");
        z.setOrderAmount(550.75);
        z.setDeliveryAddress("MG Road, Pune");
        
        // Check the status
        z.checkOrderStatus();
    }
}