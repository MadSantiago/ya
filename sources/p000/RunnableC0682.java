package p000;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘُؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0682 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Cloneable f2487;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f2488;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f2489;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f2490;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2491 = 0;

    public /* synthetic */ RunnableC0682(C2391 c2391, int i, C3610 c3610, Intent intent) {
        this.f2488 = c2391;
        this.f2490 = i;
        this.f2489 = c3610;
        this.f2487 = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2491;
        Object obj = this.f2487;
        Object obj2 = this.f2489;
        int i2 = this.f2490;
        Object obj3 = this.f2488;
        switch (i) {
            case 0:
                ((InterfaceC3665) ((RunnableC1877) obj3).f6228).mo6147(i2, (Exception) obj2, (byte[]) obj);
                break;
            default:
                C3610 c3610 = (C3610) obj2;
                Intent intent = (Intent) obj;
                Service service = (Service) ((C2391) obj3).f7924;
                InterfaceC3258 interfaceC3258 = (InterfaceC3258) service;
                if (interfaceC3258.mo116(i2)) {
                    c3610.f12023.m9430(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
                    C3610 c3611 = C5371.m9019(service, null, null, null).f17717;
                    C5371.m9020(c3611);
                    c3611.f12023.m9432("Completed wakeful intent.");
                    interfaceC3258.mo115(intent);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0682(RunnableC1877 runnableC1877, int i, Exception exc, byte[] bArr, Map map) {
        this.f2488 = runnableC1877;
        this.f2490 = i;
        this.f2489 = exc;
        this.f2487 = bArr;
    }
}
