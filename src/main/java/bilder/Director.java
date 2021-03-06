package bilder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website webite = builder.getWebSite();

        return webite;
    }


}
