package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٖۨؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5873 extends AbstractC4623 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f19392;

    /* JADX INFO: renamed from: ۥُ */
    public float f19393;

    /* JADX INFO: renamed from: ۥّ */
    public float f19394;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f19395;

    /* JADX INFO: renamed from: ۥۜ */
    public float f19396;

    /* JADX INFO: renamed from: ۥۣ */
    public final Matrix f19397;

    /* JADX INFO: renamed from: ۦؑ */
    public float f19398;

    /* JADX INFO: renamed from: ۦِ */
    public final Matrix f19399;

    /* JADX INFO: renamed from: ۦٛ */
    public float f19400;

    /* JADX INFO: renamed from: ۦۗ */
    public String f19401;

    /* JADX INFO: renamed from: ۦۙ */
    public float f19402;

    public C5873(C5873 c5873, C4461 c4461) {
        AbstractC2653 c4364;
        this.f19397 = new Matrix();
        this.f19395 = new ArrayList();
        this.f19392 = 0.0f;
        this.f19398 = 0.0f;
        this.f19393 = 0.0f;
        this.f19394 = 1.0f;
        this.f19402 = 1.0f;
        this.f19396 = 0.0f;
        this.f19400 = 0.0f;
        Matrix matrix = new Matrix();
        this.f19399 = matrix;
        this.f19401 = null;
        this.f19392 = c5873.f19392;
        this.f19398 = c5873.f19398;
        this.f19393 = c5873.f19393;
        this.f19394 = c5873.f19394;
        this.f19402 = c5873.f19402;
        this.f19396 = c5873.f19396;
        this.f19400 = c5873.f19400;
        String str = c5873.f19401;
        this.f19401 = str;
        if (str != null) {
            c4461.put(str, this);
        }
        matrix.set(c5873.f19399);
        ArrayList arrayList = c5873.f19395;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C5873) {
                this.f19395.add(new C5873((C5873) obj, c4461));
            } else {
                if (obj instanceof C1191) {
                    C1191 c1191 = (C1191) obj;
                    C1191 c1192 = new C1191(c1191);
                    c1192.f4100 = 0.0f;
                    c1192.f4109 = 1.0f;
                    c1192.f4102 = 1.0f;
                    c1192.f4107 = 0.0f;
                    c1192.f4106 = 1.0f;
                    c1192.f4108 = 0.0f;
                    c1192.f4104 = Paint.Cap.BUTT;
                    c1192.f4105 = Paint.Join.MITER;
                    c1192.f4110 = 4.0f;
                    c1192.f4103 = c1191.f4103;
                    c1192.f4100 = c1191.f4100;
                    c1192.f4109 = c1191.f4109;
                    c1192.f4101 = c1191.f4101;
                    c1192.f8805 = c1191.f8805;
                    c1192.f4102 = c1191.f4102;
                    c1192.f4107 = c1191.f4107;
                    c1192.f4106 = c1191.f4106;
                    c1192.f4108 = c1191.f4108;
                    c1192.f4104 = c1191.f4104;
                    c1192.f4105 = c1191.f4105;
                    c1192.f4110 = c1191.f4110;
                    c4364 = c1192;
                } else {
                    if (!(obj instanceof C4364)) {
                        C1078.m2276("Unknown object in the tree!");
                        throw null;
                    }
                    c4364 = new C4364((C4364) obj);
                }
                this.f19395.add(c4364);
                Object obj2 = c4364.f8806;
                if (obj2 != null) {
                    c4461.put(obj2, c4364);
                }
            }
        }
    }

    public String getGroupName() {
        return this.f19401;
    }

    public Matrix getLocalMatrix() {
        return this.f19399;
    }

    public float getPivotX() {
        return this.f19398;
    }

    public float getPivotY() {
        return this.f19393;
    }

    public float getRotation() {
        return this.f19392;
    }

    public float getScaleX() {
        return this.f19394;
    }

    public float getScaleY() {
        return this.f19402;
    }

    public float getTranslateX() {
        return this.f19396;
    }

    public float getTranslateY() {
        return this.f19400;
    }

    public void setPivotX(float f) {
        if (f != this.f19398) {
            this.f19398 = f;
            m9689();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f19393) {
            this.f19393 = f;
            m9689();
        }
    }

    public void setRotation(float f) {
        if (f != this.f19392) {
            this.f19392 = f;
            m9689();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f19394) {
            this.f19394 = f;
            m9689();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f19402) {
            this.f19402 = f;
            m9689();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f19396) {
            this.f19396 = f;
            m9689();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f19400) {
            this.f19400 = f;
            m9689();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9689() {
        Matrix matrix = this.f19399;
        matrix.reset();
        matrix.postTranslate(-this.f19398, -this.f19393);
        matrix.postScale(this.f19394, this.f19402);
        matrix.postRotate(this.f19392, 0.0f, 0.0f);
        matrix.postTranslate(this.f19396 + this.f19398, this.f19400 + this.f19393);
    }

    @Override // p000.AbstractC4623
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo2508(int[] iArr) {
        int i = 0;
        boolean zMo2508 = false;
        while (true) {
            ArrayList arrayList = this.f19395;
            if (i >= arrayList.size()) {
                return zMo2508;
            }
            zMo2508 |= ((AbstractC4623) arrayList.get(i)).mo2508(iArr);
            i++;
        }
    }

    @Override // p000.AbstractC4623
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2509() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19395;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC4623) arrayList.get(i)).mo2509()) {
                return true;
            }
            i++;
        }
    }

    public C5873() {
        this.f19397 = new Matrix();
        this.f19395 = new ArrayList();
        this.f19392 = 0.0f;
        this.f19398 = 0.0f;
        this.f19393 = 0.0f;
        this.f19394 = 1.0f;
        this.f19402 = 1.0f;
        this.f19396 = 0.0f;
        this.f19400 = 0.0f;
        this.f19399 = new Matrix();
        this.f19401 = null;
    }
}
