package p000;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥْٟۤؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2658 implements Appendable, CharSequence {

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayDeque f8817 = new ArrayDeque(8);

    /* JADX INFO: renamed from: ۦۨ */
    public final StringBuilder f8818 = new StringBuilder((CharSequence) "");

    public C2658() {
        m4966(0, "");
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m4964(C2658 c2658, Object obj, int i, int i2) {
        if (obj != null) {
            int length = c2658.f8818.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            m4965(c2658, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m4965(C2658 c2658, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                c2658.f8817.push(new C1992(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                m4965(c2658, obj2, i, i2);
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f8818;
        m4966(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f8818.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8818.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<C1992> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.f8818;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.f8817;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    C1992 c1992 = (C1992) itDescendingIterator.next();
                    int i4 = c1992.f6572;
                    if ((i4 >= i && i4 < i2) || (((i3 = c1992.f6571) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(c1992);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (C1992 c1993 : listUnmodifiableList) {
            int iMax = Math.max(0, c1993.f6572 - i);
            spannableStringBuilder.setSpan(c1993.f6573, iMax, Math.min(length2, (c1993.f6571 - c1993.f6572) + iMax), c1993.f6574);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8818.toString();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4966(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C4694;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f8817;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new C1992(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    arrayDeque.push(new C1992(obj2, spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4967(char c) {
        this.f8818.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f8818.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.f8818;
        m4966(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
