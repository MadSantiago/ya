package p000;

import android.p001os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥْؔۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1213 extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2600 f4195;

    public C1213(C2600 c2600) {
        super(false);
        this.f4195 = c2600;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f4195.mo335(new C4535(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f4195.mo335(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ")";
    }
}
