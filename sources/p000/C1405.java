package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۥَٕؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1405 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f4835;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f4836;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f4837;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f4838;

    public C1405(C2711 c2711, boolean z) {
        this.f4838 = c2711;
        this.f4835 = new AtomicReference(null);
        this.f4837 = z;
        this.f4836 = new AtomicMarkableReference(new C5911(z ? 8192 : 1024), false);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public boolean m2970(int[] iArr) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f4836;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.f4838;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.f4837 = true;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m2971(String str) {
        SharedPreferences.Editor editorEdit = ((C4474) this.f4838).m7755().edit();
        editorEdit.putString((String) this.f4836, str);
        editorEdit.apply();
        this.f4835 = str;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C5051 m2972(int i) {
        C5051 c5051;
        C0992 c0992 = (C0992) this.f4838;
        synchronized (c0992) {
            if (this.f4837) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f4835)[i] = true;
            Object obj = ((C1959) this.f4836).f6461.get(i);
            C1248 c1248 = c0992.f3532;
            C5051 c5052 = (C5051) obj;
            if (!c1248.m3319(c5052)) {
                AbstractC0080.m7960(c1248.mo1568(c5052));
            }
            c5051 = (C5051) obj;
        }
        return c5051;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m2973(boolean z) {
        C0992 c0992 = (C0992) this.f4838;
        synchronized (c0992) {
            try {
                if (this.f4837) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC3831.m6874(((C1959) this.f4836).f6463, this)) {
                    c0992.m2117(this, z);
                }
                this.f4837 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public String m2974() {
        if (!this.f4837) {
            this.f4837 = true;
            C4474 c4474 = (C4474) this.f4838;
            this.f4835 = c4474.m7755().getString((String) this.f4836, null);
        }
        return (String) this.f4835;
    }

    public C1405(C4474 c4474, String str) {
        this.f4838 = c4474;
        AbstractC0487.m1090(str);
        this.f4836 = str;
    }

    public C1405() {
        this.f4836 = new Object();
        this.f4835 = new ArrayList();
        this.f4838 = new ArrayList();
        this.f4837 = true;
    }

    public C1405(C4752 c4752, C1795 c1795, C2274[] c2274Arr, boolean z) {
        this.f4838 = c4752;
        this.f4836 = c1795;
        this.f4835 = c2274Arr;
        this.f4837 = z;
    }

    public C1405(C0880 c0880, C4319 c4319, InterfaceC0762 interfaceC0762) {
        this.f4836 = c0880;
        this.f4835 = c4319;
        this.f4838 = interfaceC0762;
        this.f4837 = true;
    }

    public C1405(int i) {
        this.f4836 = new ReentrantLock();
        this.f4838 = new long[i];
        this.f4835 = new boolean[i];
    }

    public C1405(C0992 c0992, C1959 c1959) {
        this.f4838 = c0992;
        this.f4836 = c1959;
        this.f4835 = new boolean[2];
    }
}
