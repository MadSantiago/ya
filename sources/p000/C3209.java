package p000;

import android.content.ServiceConnection;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦؔؑٔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3209 extends AbstractC1053 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C3368 f10766;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2585 f10767;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3209(C3368 c3368, InterfaceC2585 interfaceC2585) {
        super(interfaceC2585.asBinder());
        this.f10766 = c3368;
        this.f10767 = interfaceC2585;
    }

    @Override // p000.AbstractC1053
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2260() {
        C3368 c3368 = this.f10766;
        if (c3368.f11252 == this) {
            c3368.f11252 = null;
        }
        if (c3368.f11251 == this) {
            c3368.f11251 = null;
        }
        Iterator it = c3368.f11249.values().iterator();
        while (it.hasNext()) {
            if (((C1356) it.next()).f4660 == this) {
                it.remove();
            }
        }
        Iterator it2 = c3368.f11250.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            C2087 c2087 = (C2087) entry.getValue();
            if (((C1356) ((Pair) c2087).first).f4660 == this) {
                c2087.m4027((ServiceConnection) entry.getKey());
                it2.remove();
            }
        }
    }
}
