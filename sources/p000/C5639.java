package p000;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: ۦۤؑۗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5639 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f18579;

    /* JADX INFO: renamed from: ۥُ */
    public final int f18580;

    /* JADX INFO: renamed from: ۥّ */
    public int f18581;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5470 f18582;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f18583;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f18584;

    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    public C5639(List list, C5470 c5470) {
        MotionEvent motionEventM9476;
        this.f18583 = list;
        this.f18582 = c5470;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.f18579 = (i < 29 || (motionEventM9476 = m9476()) == null) ? 0 : motionEventM9476.getClassification();
        MotionEvent motionEventM9477 = m9476();
        this.f18584 = motionEventM9477 != null ? motionEventM9477.getButtonState() : 0;
        MotionEvent motionEventM9478 = m9476();
        this.f18580 = motionEventM9478 != null ? motionEventM9478.getMetaState() : 0;
        MotionEvent motionEventM9479 = m9476();
        if (motionEventM9479 != null) {
            boolean z = i >= 29 && motionEventM9479.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventM9479.getClassification() == 5;
            int actionMasked = motionEventM9479.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                if (z) {
                                    i2 = 10;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (z) {
                                    i2 = 12;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                } else {
                    i2 = 2;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            } else {
                i2 = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    C3536 c3536 = (C3536) list.get(i2);
                    if (AbstractC3801.m6754(c3536)) {
                        i2 = 2;
                    } else if (AbstractC3801.m6800(c3536)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.f18581 = i2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final MotionEvent m9476() {
        C5470 c5470 = this.f18582;
        if (c5470 != null) {
            return (MotionEvent) ((C3369) c5470.f18037).f11254;
        }
        return null;
    }
}
