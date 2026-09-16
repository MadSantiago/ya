package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: ۥؚ۟ؗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2467 extends AbstractC0057 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f8237 = 0;

    /* JADX INFO: renamed from: ۥُ */
    public final Object f8238;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ LayoutInflaterFactory2C1852 f8239;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2467(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852, Context context) {
        super(layoutInflaterFactory2C1852);
        this.f8239 = layoutInflaterFactory2C1852;
        this.f8238 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۥّ */
    public final int mo4628() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.f8237;
        Object obj = this.f8238;
        switch (i) {
            case 0:
                return AbstractC4431.m7723((PowerManager) obj) ? 2 : 1;
            default:
                C5460 c5460 = (C5460) obj;
                LocationManager locationManager = (LocationManager) c5460.f17999;
                C0203 c0203 = (C0203) c5460.f18000;
                if (c0203.f749 <= System.currentTimeMillis()) {
                    Context context = (Context) c5460.f18001;
                    Location lastKnownLocation2 = null;
                    if (AbstractC2776.m5226(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (AbstractC2776.m5226(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0467 c0467 = C0467.f1687;
                        if (c0467 == null) {
                            c0467 = new C0467();
                            C0467.f1687 = c0467;
                        }
                        C0467 c0468 = c0467;
                        c0468.m984(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c0468.m984(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c0468.f1688 == 1;
                        long j2 = c0468.f1689;
                        long j3 = c0468.f1690;
                        c0468.m984(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = c0468.f1689;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        c0203.f750 = z;
                        c0203.f749 = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = c0203.f750;
                }
                return z ? 2 : 1;
        }
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۦؑ */
    public final IntentFilter mo4629() {
        switch (this.f8237) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p000.AbstractC0057
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo4630() {
        int i = this.f8237;
        LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = this.f8239;
        switch (i) {
            case 0:
                layoutInflaterFactory2C1852.m3665(true, true);
                break;
            default:
                layoutInflaterFactory2C1852.m3665(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2467(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852, C5460 c5460) {
        super(layoutInflaterFactory2C1852);
        this.f8239 = layoutInflaterFactory2C1852;
        this.f8238 = c5460;
    }
}
