package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ۦۣؓؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3154 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Context f10631;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10632;

    public /* synthetic */ C3154(Context context, int i) {
        this.f10632 = i;
        this.f10631 = context;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() throws IOException {
        int i = this.f10632;
        Context context = this.f10631;
        switch (i) {
            case 0:
                File fileM4823 = AbstractC2552.m4823(context, "firebaseSessions/sessionConfigsDataStore.data");
                C1397.m2958(fileM4823);
                return fileM4823;
            default:
                File fileM4824 = AbstractC2552.m4823(context, "firebaseSessions/sessionDataStore.data");
                C1397.m2958(fileM4824);
                return fileM4824;
        }
    }
}
