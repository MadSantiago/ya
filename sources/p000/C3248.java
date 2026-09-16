package p000;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦُؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3248 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ۥؗ */
    public final Thread.UncaughtExceptionHandler f10910;

    /* JADX INFO: renamed from: ۥُ */
    public final AtomicBoolean f10911 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥۗ */
    public final C5534 f10912;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4228 f10913;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4843 f10914;

    public C3248(C4228 c4228, C5534 c5534, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4843 c4843) {
        this.f10913 = c4228;
        this.f10912 = c5534;
        this.f10910 = uncaughtExceptionHandler;
        this.f10914 = c4843;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10910;
        AtomicBoolean atomicBoolean = this.f10911;
        atomicBoolean.set(true);
        try {
            try {
                if (m5966(thread, th)) {
                    this.f10913.m7500(this.f10912, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e) {
                C1397 c1397 = C1397.f4781;
                if (c1397.m2969(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                if (uncaughtExceptionHandler != null) {
                    c1397.m2965("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    c1397.m2965("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5966(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f10914.m8214()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }
}
