package p000;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: renamed from: ۦۜؗٓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5300 extends AbstractC1003 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f17457;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ Object f17458;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5300(Object obj, InterfaceC1150 interfaceC1150, int i) {
        super(interfaceC1150);
        this.f17457 = i;
        this.f17458 = obj;
    }

    @Override // p000.AbstractC1003
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1720() {
        int i = this.f17457;
        Object obj = this.f17458;
        switch (i) {
            case 0:
                C0616 c0616 = (C0616) obj;
                C4423 c4423 = c0616.f2301;
                c4423.mo6517();
                C5371 c5371 = (C5371) c4423.f18660;
                c5371.f17719.getClass();
                c0616.m1382(false, false, SystemClock.elapsedRealtime());
                C4961 c4961 = c5371.f17725;
                C5371.m9022(c4961);
                c5371.f17719.getClass();
                c4961.m8339(SystemClock.elapsedRealtime());
                break;
            case 1:
                C1564 c1564 = (C1564) obj;
                c1564.m3314();
                C3610 c3610 = ((C5371) c1564.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12023.m9432("Starting upload from DelayedRunnable");
                c1564.f19371.m8498();
                break;
            default:
                C5034 c5034 = (C5034) obj;
                c5034.mo2406().mo6517();
                String str = (String) c5034.f16672.pollFirst();
                if (str != null) {
                    c5034.mo2403().getClass();
                    c5034.f16666 = SystemClock.elapsedRealtime();
                    c5034.mo2404().f12023.m9430(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = c5034.f16665.f17739;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                c5034.m8520();
                break;
        }
    }
}
