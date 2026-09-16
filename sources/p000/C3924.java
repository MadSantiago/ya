package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦُؗٗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3924 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5460 f13080;

    /* JADX INFO: renamed from: ۥۗ */
    public C1489 f13081;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1489 f13082;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4898 f13083;

    public C3924() {
        C1489 c1489 = new C1489(24);
        this.f13082 = c1489;
        this.f13081 = ((C1489) c1489.f5057).m3148();
        this.f13080 = new C5460(9);
        C4898 c4898 = new C4898();
        c4898.f16143 = new TreeMap();
        c4898.f16142 = new TreeMap();
        this.f13083 = c4898;
        final int i = 1;
        Callable callable = new Callable(this) { // from class: ۥٕۨؒؒ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3924 f9665;

            {
                this.f9665 = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                C3924 c3924 = this.f9665;
                switch (i2) {
                    case 0:
                        return new C2651(c3924.f13080);
                    default:
                        return new C2651(c3924.f13083);
                }
            }
        };
        HashMap map = ((C5008) c1489.f5056).f16580;
        map.put("internal.registerCallback", callable);
        final int i2 = 0;
        map.put("internal.eventLogger", new Callable(this) { // from class: ۥٕۨؒؒ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3924 f9665;

            {
                this.f9665 = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                C3924 c3924 = this.f9665;
                switch (i3) {
                    case 0:
                        return new C2651(c3924.f13080);
                    default:
                        return new C2651(c3924.f13083);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7023(C5808 c5808) {
        AbstractC1079 abstractC1079;
        try {
            C1489 c1489 = this.f13082;
            this.f13081 = ((C1489) c1489.f5057).m3148();
            if (c1489.m3162(this.f13081, (C1854[]) c5808.m9623().toArray(new C1854[0])) instanceof C1710) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2260 c2260 : c5808.m9622().m6527()) {
                List listM4302 = c2260.m4302();
                String strM4303 = c2260.m4303();
                Iterator it = listM4302.iterator();
                while (it.hasNext()) {
                    InterfaceC2150 interfaceC2150M3162 = c1489.m3162(this.f13081, (C1854) it.next());
                    if (!(interfaceC2150M3162 instanceof C5162)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C1489 c14810 = this.f13081;
                    if (c14810.m3153(strM4303)) {
                        InterfaceC2150 interfaceC2150M3146 = c14810.m3146(strM4303);
                        if (!(interfaceC2150M3146 instanceof AbstractC1079)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM4303)));
                        }
                        abstractC1079 = (AbstractC1079) interfaceC2150M3146;
                    } else {
                        abstractC1079 = null;
                    }
                    if (abstractC1079 == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM4303)));
                    }
                    abstractC1079.mo779(this.f13081, Collections.singletonList(interfaceC2150M3162));
                }
            }
        } catch (Throwable th) {
            throw new C0898(th);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7024(C0606 c0606) throws C0898 {
        C5460 c5460 = this.f13080;
        try {
            c5460.f18001 = c0606;
            c5460.f17999 = c0606.clone();
            ((ArrayList) c5460.f18000).clear();
            ((C1489) this.f13082.f5058).m3100("runtime.counter", new C5563(Double.valueOf(0.0d)));
            this.f13083.m8238(this.f13081.m3148(), c5460);
            return (((C0606) c5460.f17999).equals((C0606) c5460.f18001) && ((ArrayList) c5460.f18000).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new C0898(th);
        }
    }
}
