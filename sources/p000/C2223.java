package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: renamed from: ۥۙؕؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2223 extends AbstractC3092 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2332 f7360;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5470 f7361;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1298 f7362;

    public C2223(int i, C5470 c5470, C2332 c2332, C1298 c1298) {
        super(i);
        this.f7360 = c2332;
        this.f7361 = c5470;
        this.f7362 = c1298;
        if (i == 2 && c5470.f18035) {
            C1078.m2272("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3475(Status status) {
        this.f7362.getClass();
        this.f7360.m4375(status.f298 != null ? new C5456(status) : new C1717(status));
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3476(C3184 c3184) throws DeadObjectException {
        C2332 c2332 = this.f7360;
        try {
            C5470 c5470 = this.f7361;
            ((InterfaceC1170) ((C5470) c5470.f18037).f18034).accept(c3184.f10702, c2332);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo3475(AbstractC3092.m5679(e2));
        } catch (RuntimeException e3) {
            c2332.m4375(e3);
        }
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3477(C2346 c2346, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) c2346.f7785;
        C2332 c2332 = this.f7360;
        map.put(c2332, boolValueOf);
        C3580 c3580 = c2332.f7721;
        C2346 c2347 = new C2346(19, c2346, c2332, false);
        c3580.getClass();
        c3580.f11911.m9159(new C3517(AbstractC4007.f13360, c2347));
        c3580.m6400();
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥۗ */
    public final C2274[] mo3478(C3184 c3184) {
        return (C2274[]) this.f7361.f18034;
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo3480(C3184 c3184) {
        return this.f7361.f18035;
    }

    @Override // p000.AbstractC3092
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3481(Exception exc) {
        this.f7360.m4375(exc);
    }
}
