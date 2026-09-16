package p000;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٖؓۤٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4292 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5695 f14190;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5855 f14191;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14192;

    public RunnableC4292(C5695 c5695, C5855 c5855) {
        this.f14192 = 4;
        this.f14191 = c5855;
        Objects.requireNonNull(c5695);
        this.f14190 = c5695;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f14192;
        C5855 c5855 = this.f14191;
        C5695 c5695 = this.f14190;
        switch (i) {
            case 0:
                C5371 c5371 = (C5371) c5695.f18660;
                InterfaceC5253 interfaceC5253 = c5695.f18733;
                if (interfaceC5253 != null) {
                    try {
                        interfaceC5253.mo6906(c5855);
                    } catch (RemoteException e) {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12020.m9430(e, "Failed to reset data on the service: remote exception");
                    }
                    c5695.m9520();
                } else {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9432("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                InterfaceC5253 interfaceC5254 = c5695.f18733;
                C5371 c5372 = (C5371) c5695.f18660;
                if (interfaceC5254 == null) {
                    C3610 c3612 = c5372.f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9432("Discarding data. Failed to send app launch");
                } else {
                    try {
                        C0515 c0515 = c5372.f17715;
                        C2462 c2462 = AbstractC4936.f19569;
                        if (c0515.m1162(null, c2462)) {
                            c5695.m9513(interfaceC5254, null, c5855);
                        }
                        interfaceC5254.mo6917(c5855);
                        c5372.m9026().m9085();
                        c5372.f17715.m1162(null, c2462);
                        c5695.m9513(interfaceC5254, null, c5855);
                        c5695.m9520();
                    } catch (RemoteException e2) {
                        C3610 c3613 = c5372.f17717;
                        C5371.m9020(c3613);
                        c3613.f12020.m9430(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5371 c5373 = (C5371) c5695.f18660;
                InterfaceC5253 interfaceC5255 = c5695.f18733;
                if (interfaceC5255 == null) {
                    C3610 c3614 = c5373.f17717;
                    C5371.m9020(c3614);
                    c3614.f12022.m9432("Failed to send app backgrounded");
                } else {
                    try {
                        interfaceC5255.mo6920(c5855);
                        c5695.m9520();
                    } catch (RemoteException e3) {
                        C3610 c3615 = c5373.f17717;
                        C5371.m9020(c3615);
                        c3615.f12020.m9430(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5371 c5374 = (C5371) c5695.f18660;
                InterfaceC5253 interfaceC5256 = c5695.f18733;
                if (interfaceC5256 == null) {
                    C3610 c3616 = c5374.f17717;
                    C5371.m9020(c3616);
                    c3616.f12020.m9432("Failed to send measurementEnabled to service");
                } else {
                    try {
                        interfaceC5256.mo6923(c5855);
                        c5695.m9520();
                    } catch (RemoteException e4) {
                        C3610 c3617 = c5374.f17717;
                        C5371.m9020(c3617);
                        c3617.f12020.m9430(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                InterfaceC5253 interfaceC5257 = c5695.f18733;
                C5371 c5375 = (C5371) c5695.f18660;
                if (interfaceC5257 == null) {
                    C3610 c3618 = c5375.f17717;
                    C5371.m9020(c3618);
                    c3618.f12020.m9432("Failed to send consent settings to service");
                } else {
                    try {
                        interfaceC5257.mo6909(c5855);
                        c5695.m9520();
                    } catch (RemoteException e5) {
                        C3610 c3619 = c5375.f17717;
                        C5371.m9020(c3619);
                        c3619.f12020.m9430(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC4292(C5695 c5695, C5855 c5855, int i) {
        this.f14192 = i;
        this.f14191 = c5855;
        this.f14190 = c5695;
    }
}
