package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦؙؚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3525 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3369 f11673;

    /* JADX INFO: renamed from: ۥُ */
    public C5002 f11674;

    /* JADX INFO: renamed from: ۥّ */
    public C5002 f11675;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1377 f11676;

    /* JADX INFO: renamed from: ۥۜ */
    public final C0578 f11677;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f11678;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f11679;

    /* JADX INFO: renamed from: ۦؚ */
    public final C2702 f11680;

    /* JADX INFO: renamed from: ۦٌ */
    public final C4843 f11681;

    /* JADX INFO: renamed from: ۦِ */
    public final C1898 f11682;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2711 f11683;

    /* JADX INFO: renamed from: ۦۗ */
    public final C1898 f11684;

    /* JADX INFO: renamed from: ۦۙ */
    public C4743 f11685;

    /* JADX INFO: renamed from: ۦۚ */
    public final C3121 f11686;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2808 f11687;

    public C3525(C0377 c0377, C0578 c0578, C4843 c4843, C1377 c1377, C1898 c1898, C1898 c1899, C2711 c2711, C2702 c2702, C3121 c3121, C2808 c2808) {
        this.f11676 = c1377;
        c0377.m825();
        this.f11678 = c0377.f1410;
        this.f11677 = c0578;
        this.f11681 = c4843;
        this.f11682 = c1898;
        this.f11684 = c1899;
        this.f11683 = c2711;
        this.f11680 = c2702;
        this.f11686 = c3121;
        this.f11687 = c2808;
        this.f11679 = System.currentTimeMillis();
        this.f11673 = new C3369(21);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6317() {
        C2808.m5331();
        try {
            C5002 c5002 = this.f11674;
            C2711 c2711 = (C2711) c5002.f16550;
            if (new File((File) c2711.f8980, (String) c5002.f16551).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6318(C5534 c5534) {
        Future<?> futureSubmit = ((ExecutorC2291) this.f11687.f9378).f7614.submit(new RunnableC5598(this, c5534, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6319(C5534 c5534) {
        C2808.m5331();
        C2808.m5331();
        this.f11674.m8415();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f11682.mo3079(new C2202(this));
                this.f11685.m8066();
                if (!c5534.m9209().f16723.f5152) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f11685.m8068(c5534)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f11685.m8069(((C2332) ((AtomicReference) c5534.f18264).get()).f7721);
                m6317();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                m6317();
            }
        } catch (Throwable th) {
            m6317();
            throw th;
        }
    }
}
