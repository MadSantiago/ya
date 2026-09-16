package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥۦؙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2838 implements Callable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C4743 f9476;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Thread f9477;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5534 f9478;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Throwable f9479;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ long f9480;

    public CallableC2838(C4743 c4743, long j, Throwable th, Thread thread, C5534 c5534) {
        this.f9476 = c4743;
        this.f9480 = j;
        this.f9479 = th;
        this.f9477 = thread;
        this.f9478 = c5534;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f9480;
        long j2 = j / 1000;
        C4743 c4743 = this.f9476;
        String strM8063 = c4743.m8063();
        if (strM8063 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return AbstractC5378.m9075(null);
        }
        c4743.f15654.m8415();
        C3571 c3571 = c4743.f15663;
        String strConcat = "Persisting fatal event for session ".concat(strM8063);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c3571.m6374(this.f9479, this.f9477, "crash", new C1097(strM8063, j2, C0204.f751), true);
        try {
            if (!new File((File) c4743.f15667.f8980, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        C5534 c5534 = this.f9478;
        c4743.m8067(false, c5534, false);
        c4743.m8065(new C3042().f10230, Boolean.FALSE);
        return !c4743.f15658.m2929() ? AbstractC5378.m9075(null) : ((C2332) ((AtomicReference) c5534.f18264).get()).f7721.m6396((ExecutorC2291) c4743.f15655.f9378, new C5086(this, strM8063));
    }
}
