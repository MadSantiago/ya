package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٕؒؓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3097 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f10384;

    /* JADX INFO: renamed from: ۦۨ */
    public final Class f10385;

    public C3097(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f10384 = new ArrayList();
        if (cls != null) {
            this.f10385 = cls;
        } else {
            C0178.m387("watcherClass cannot be null");
            throw null;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C4914 c4914M5685;
        if (m5684(obj) && (c4914M5685 = m5685(obj)) != null) {
            obj = c4914M5685;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C4914 c4914M5685;
        if (m5684(obj) && (c4914M5685 = m5685(obj)) != null) {
            obj = c4914M5685;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C4914 c4914M5685;
        if (m5684(obj) && (c4914M5685 = m5685(obj)) != null) {
            obj = c4914M5685;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f10385 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C4914[] c4914Arr = (C4914[]) super.getSpans(i, i2, C4914.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c4914Arr.length);
        for (int i3 = 0; i3 < c4914Arr.length; i3++) {
            objArr[i3] = c4914Arr[i3].f16214;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f10385 == cls) {
            cls = C4914.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C4914 c4914M5685;
        if (m5684(obj)) {
            c4914M5685 = m5685(obj);
            if (c4914M5685 != null) {
                obj = c4914M5685;
            }
        } else {
            c4914M5685 = null;
        }
        super.removeSpan(obj);
        if (c4914M5685 != null) {
            this.f10384.remove(c4914M5685);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.f10384;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((C4914) arrayList.get(i3)).f16213.incrementAndGet();
            i3++;
        }
        super.replace(i, i2, charSequence);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C4914) arrayList.get(i4)).f16213.decrementAndGet();
        }
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m5684(obj)) {
            C4914 c4914 = new C4914(obj);
            this.f10384.add(c4914);
            obj = c4914;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C3097(this.f10385, this, i, i2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m5684(Object obj) {
        if (obj != null) {
            return this.f10385 == obj.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C4914 m5685(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10384;
            if (i >= arrayList.size()) {
                return null;
            }
            C4914 c4914 = (C4914) arrayList.get(i);
            if (c4914.f16214 == obj) {
                return c4914;
            }
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public C3097(Class cls, C3097 c3097, int i, int i2) {
        super(c3097, i, i2);
        this.f10384 = new ArrayList();
        if (cls != null) {
            this.f10385 = cls;
        } else {
            C0178.m387("watcherClass cannot be null");
            throw null;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        ArrayList arrayList;
        int i5 = 0;
        while (true) {
            arrayList = this.f10384;
            if (i5 >= arrayList.size()) {
                break;
            }
            ((C4914) arrayList.get(i5)).f16213.incrementAndGet();
            i5++;
        }
        super.replace(i, i2, charSequence, i3, i4);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((C4914) arrayList.get(i6)).f16213.decrementAndGet();
        }
        return this;
    }
}
