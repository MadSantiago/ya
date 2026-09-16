package p000;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: ۦۗؓۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4958 {

    /* JADX INFO: renamed from: ۥْ */
    public int f16400;

    /* JADX INFO: renamed from: ۥٓ */
    public final Serializable f16401;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f16402;

    /* JADX INFO: renamed from: ۦۨ */
    public int f16403;

    public AbstractC4958(C3598 c3598) {
        this.f16401 = c3598;
        this.f16402 = -1;
        this.f16400 = c3598.f11976;
        m8336();
    }

    public boolean hasNext() {
        return this.f16403 < ((C3598) this.f16401).f11971;
    }

    public void remove() {
        C3598 c3598 = (C3598) this.f16401;
        m8335();
        if (this.f16402 == -1) {
            C1078.m2276("Call next() before removing element from the iterator.");
            return;
        }
        c3598.m6404();
        c3598.m6411(this.f16402);
        this.f16402 = -1;
        this.f16400 = c3598.f11976;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract void mo3792(View view, Object obj);

    /* JADX INFO: renamed from: ۥُ */
    public void m8334(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f16402) {
            mo3792(view, obj);
            return;
        }
        C0004 c0004 = null;
        if (Build.VERSION.SDK_INT >= this.f16402) {
            tag = mo3794(view);
        } else {
            tag = view.getTag(this.f16403);
            if (!((Class) this.f16401).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo3793(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM6428 = AbstractC3608.m6428(view);
            if (accessibilityDelegateM6428 != null) {
                c0004 = accessibilityDelegateM6428 instanceof C0030 ? ((C0030) accessibilityDelegateM6428).f5997 : new C0004(accessibilityDelegateM6428);
            }
            if (c0004 == null) {
                c0004 = new C0004();
            }
            AbstractC3608.m6434(view, c0004);
            view.setTag(this.f16403, obj);
            AbstractC3608.m6437(view, this.f16400);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public abstract boolean mo3793(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract Object mo3794(View view);

    /* JADX INFO: renamed from: ۥۣ */
    public void m8335() {
        if (((C3598) this.f16401).f11976 != this.f16400) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m8336() {
        while (true) {
            int i = this.f16403;
            C3598 c3598 = (C3598) this.f16401;
            if (i >= c3598.f11971 || c3598.f11969[i] >= 0) {
                return;
            } else {
                this.f16403 = i + 1;
            }
        }
    }

    public AbstractC4958(int i, Class cls, int i2, int i3) {
        this.f16403 = i;
        this.f16401 = cls;
        this.f16400 = i2;
        this.f16402 = i3;
    }
}
