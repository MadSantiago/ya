package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: renamed from: ۥٖٙؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 implements InterfaceC3800 {

    /* JADX INFO: renamed from: ۥْ */
    public final C0811 f5575 = new C0811(1.0f);

    /* JADX INFO: renamed from: ۥٓ */
    public C2127 f5576;

    /* JADX INFO: renamed from: ۦ۟ */
    public C3950 f5577;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f5578;

    public C1673(Context context) {
        this.f5578 = context;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3800
    /* JADX INFO: renamed from: ۦؖ */
    public final float mo3501() {
        InterfaceC4311 interfaceC4311;
        if (this.f5576 == null) {
            Context context = this.f5578;
            C3262 c3262 = AbstractC3937.f13146;
            synchronized (c3262) {
                try {
                    Object objM6027 = c3262.m6027(context);
                    if (objM6027 == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C5559 c5559M3405 = AbstractC1631.m3405(-1, 0, 6);
                        C0710 c0710 = new C0710(1, new C4522(contentResolver, uriFor, new C3397(c5559M3405, AbstractC4554.m7893(Looper.getMainLooper())), c5559M3405, context, null));
                        C2084 c2084M7891 = AbstractC4554.m7891();
                        C0649 c0649 = AbstractC0912.f3276;
                        objM6027 = AbstractC1605.m3356(c0710, new C3950(AbstractC4593.m7963(c2084M7891, AbstractC5794.f19088)), new C1901(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c3262.m6023(context, objM6027);
                    }
                    interfaceC4311 = (InterfaceC4311) objM6027;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5575.m1710(((Number) interfaceC4311.getValue()).floatValue());
            C3950 c3950 = this.f5577;
            if (c3950 == null) {
                C1078.m2276("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f5576 = AbstractC2765.m5135(c3950, null, 0, new C5030(interfaceC4311, this, null, 3), 3);
        }
        return this.f5575.m1711();
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6798(this, interfaceC2218);
    }
}
