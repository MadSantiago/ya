package p000;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚ۠ؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2500 {

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f8310;

    /* JADX INFO: renamed from: ۥۣ */
    public long f8311;

    /* JADX INFO: renamed from: ۦِ */
    public C1553 f8313;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f8314;

    /* JADX INFO: renamed from: ۥۗ */
    public final SparseLongArray f8309 = new SparseLongArray();

    /* JADX INFO: renamed from: ۥؗ */
    public final SparseBooleanArray f8306 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f8312 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public final C0638 f8307 = new C0638((Object) null);

    /* JADX INFO: renamed from: ۥّ */
    public int f8308 = -1;

    /* JADX INFO: renamed from: ۦۙ */
    public int f8315 = -1;

    /* JADX INFO: renamed from: ۥؗ */
    public final C3369 m4645(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f8306;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f8309.clear();
            sparseBooleanArray.clear();
            this.f8310 = false;
            this.f8314 = false;
            this.f8313 = null;
            return null;
        }
        m4647(motionEvent);
        m4648(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f8312;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.f8310 = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f8314 = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(m4649(viewTreeObserverOnGlobalLayoutListenerC0850, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            this.f8314 = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f8313 = new C1553((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32));
            }
            arrayList.add(m4649(viewTreeObserverOnGlobalLayoutListenerC0850, motionEvent, this.f8313, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f8310 = false;
            this.f8314 = false;
            this.f8313 = null;
        }
        m4646(motionEvent);
        motionEvent.getEventTime();
        return new C3369(27, arrayList, motionEvent);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m4646(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f8306;
        SparseLongArray sparseLongArray = this.f8309;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4647(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f8308 && source == this.f8315) {
            return;
        }
        this.f8308 = toolType;
        this.f8315 = source;
        this.f8306.clear();
        this.f8309.clear();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4648(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f8309;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f8311;
                this.f8311 = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f8311;
            this.f8311 = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f8306.put(pointerId2, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public final C0284 m4649(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, MotionEvent motionEvent, C1553 c1553, int i, boolean z) {
        long jValueAt;
        char c;
        long j;
        long jM1798;
        long j2;
        long jFloatToRawIntBits;
        long jM1785;
        int toolType;
        int i2;
        int historySize;
        char c2;
        int i3;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        int i4;
        Float fValueOf;
        float historicalX;
        int i5;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.f8309;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j3 = this.f8311;
            this.f8311 = 1 + j3;
            sparseLongArray.put(pointerId, j3);
            jValueAt = j3;
        }
        float pressure = motionEvent.getPressure(i);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32);
        if (i != 0) {
            c = ' ';
            j = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                if (c1553 != null) {
                    jFloatToRawIntBits = c1553.f5241;
                } else {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L);
                }
                jM1798 = jFloatToRawIntBits;
                jM1785 = viewTreeObserverOnGlobalLayoutListenerC0850.m1785(jM1798);
            } else {
                jM1798 = viewTreeObserverOnGlobalLayoutListenerC0850.m1798(jFloatToRawIntBits4);
                j2 = jFloatToRawIntBits4;
            }
            toolType = motionEvent.getToolType(i);
            if (toolType != 0) {
                i5 = 2;
                if (toolType == 1) {
                    i2 = ((!motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f8310 || this.f8314)) ? i5 : 1;
                } else if (toolType != 2) {
                    if (toolType != 3) {
                        i5 = 4;
                        if (toolType != 4) {
                            i2 = 0;
                        }
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            c2 = c;
            i3 = 0;
            while (true) {
                jFloatToRawIntBits2 = 0;
                fFloatValue = 1.0f;
                if (i3 < historySize) {
                    break;
                }
                historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(historicalX)) << c2) | (((long) Float.floatToRawIntBits(historicalY)) & j);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                    fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                    float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                    if (Build.VERSION.SDK_INT >= 29 && motionEvent.getClassification() == 3) {
                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                    }
                    arrayList.add(new C0545(historicalEventTime, jFloatToRawIntBits5, fFloatValue2, jFloatToRawIntBits2, jFloatToRawIntBits5));
                }
                i3++;
                historySize = historySize;
            }
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
            } else {
                jFloatToRawIntBits3 = 0;
            }
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29 && motionEvent.getClassification() == 5) {
                float axisValue = motionEvent.getAxisValue(52, i);
                fValueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                }
            }
            float f = fFloatValue;
            if (i4 < 29 && motionEvent.getClassification() == 3) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
            }
            return new C0284(jValueAt, motionEvent.getEventTime(), jM1798, j2, z, pressure, i2, this.f8306.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits3, f, jFloatToRawIntBits2, jFloatToRawIntBits4);
        }
        if (c1553 != null) {
            jM1798 = c1553.f5241;
            c = ' ';
            j = 4294967295L;
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            long jFloatToRawIntBits6 = Float.floatToRawIntBits(rawX);
            int iFloatToRawIntBits = Float.floatToRawIntBits(rawY);
            c = ' ';
            j = 4294967295L;
            jM1798 = (jFloatToRawIntBits6 << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
        }
        jM1785 = viewTreeObserverOnGlobalLayoutListenerC0850.m1785(jM1798);
        j2 = jM1785;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            i5 = 2;
            if (toolType == 1) {
                if (toolType != 2) {
                    if (toolType != 3) {
                        i5 = 4;
                        if (toolType != 4) {
                            i2 = 0;
                        }
                    }
                } else {
                    i2 = 3;
                }
            } else if (motionEvent.isFromSource(8194)) {
            }
        } else {
            i2 = 0;
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        c2 = c;
        i3 = 0;
        while (true) {
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i3 < historySize) {
                break;
                break;
            }
            historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY2 = motionEvent.getHistoricalY(i, i3);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i3++;
            historySize = historySize;
        }
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j);
        } else {
            jFloatToRawIntBits3 = 0;
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            float axisValue2 = motionEvent.getAxisValue(52, i);
            if (axisValue2 > 0.0f) {
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        float f2 = fFloatValue;
        if (i4 < 29) {
        }
        return new C0284(jValueAt, motionEvent.getEventTime(), jM1798, j2, z, pressure, i2, this.f8306.get(motionEvent.getPointerId(i), false), arrayList2, jFloatToRawIntBits3, f2, jFloatToRawIntBits2, jFloatToRawIntBits4);
    }
}
