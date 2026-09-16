package p000;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥٕؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0354 implements InterfaceC4188 {

    /* JADX INFO: renamed from: ۥؗ */
    public static volatile C0354 f1291;

    /* JADX INFO: renamed from: ۥۗ */
    public final ConcurrentHashMap f1292;

    /* JADX INFO: renamed from: ۥۣ */
    public final AppMeasurementSdk f1293;

    public C0354(AppMeasurementSdk appMeasurementSdk) {
        AbstractC0487.m1047(appMeasurementSdk);
        this.f1293 = appMeasurementSdk;
        this.f1292 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1397 m775(String str, C5002 c5002) {
        InterfaceC1170 c1039;
        if (!AbstractC1389.f4744.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f1292;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f1293;
                if (zEquals) {
                    c1039 = new C2346(appMeasurementSdk, c5002);
                } else {
                    c1039 = "clx".equals(str) ? new C1039(appMeasurementSdk, c5002) : null;
                }
                if (c1039 != null) {
                    concurrentHashMap.put(str, c1039);
                    return new C1397(25);
                }
            }
        }
        return null;
    }
}
