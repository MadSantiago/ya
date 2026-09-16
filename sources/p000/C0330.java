package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: ۥؓؖؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0330 extends AbstractC3959 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f1231;

    /* JADX INFO: renamed from: ۦۙ */
    public final C0775 f1232;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330(Context context, C1489 c1489, int i) {
        super(context, c1489);
        this.f1231 = i;
        this.f1232 = new C0775(1, this);
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo757() {
        boolean z = true;
        switch (this.f1231) {
            case 0:
                Intent intentRegisterReceiver = ((Context) this.f13232).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    C1984.m3874().m3884(AbstractC2614.f8716, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.f13232).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    C1984.m3874().m3884(AbstractC2624.f8727, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.f13232).registerReceiver(null, m759());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo758() {
        C1984.m3874().m3878(AbstractC3947.f13182, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.f13232).registerReceiver(this.f1232, m759());
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final IntentFilter m759() {
        switch (this.f1231) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo760() {
        C1984.m3874().m3878(AbstractC3947.f13182, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.f13232).unregisterReceiver(this.f1232);
    }
}
