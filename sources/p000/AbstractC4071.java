package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ۦُْؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4071 extends AbstractC4150 implements InterfaceC0858 {

    /* JADX INFO: renamed from: ۥؔ */
    public final Set f13558;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC4071(Context context, Looper looper, int i, C2813 c2813, InterfaceC1895 interfaceC1895, InterfaceC3785 interfaceC3785) {
        C3827 c3827M6820 = C3827.m6820(context);
        C1991 c1991 = C1991.f6570;
        AbstractC0487.m1047(interfaceC1895);
        AbstractC0487.m1047(interfaceC3785);
        super(context, looper, c3827M6820, c1991, i, new C2391(4, interfaceC1895), new C1039(24, interfaceC3785), (String) c2813.f9388);
        Set set = (Set) c2813.f9389;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                C1078.m2276("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.f13558 = set;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥَ */
    public final Set mo7255() {
        return this.f13558;
    }

    @Override // p000.InterfaceC0858
    /* JADX INFO: renamed from: ۥۗ */
    public final Set mo1826() {
        return mo1833() ? this.f13558 : Collections.EMPTY_SET;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦ۟ */
    public final Account mo7256() {
        return null;
    }
}
