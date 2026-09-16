package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۚؓۢؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5166 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final ReentrantLock f17103 = new ReentrantLock();

    /* JADX INFO: renamed from: ۦؑ */
    public static C5166 f17104;

    /* JADX INFO: renamed from: ۥۗ */
    public final SharedPreferences f17105;

    /* JADX INFO: renamed from: ۥۣ */
    public final ReentrantLock f17106 = new ReentrantLock();

    public C5166(Context context) {
        this.f17105 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m8774(String str) {
        ReentrantLock reentrantLock = this.f17106;
        reentrantLock.lock();
        try {
            return this.f17105.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
